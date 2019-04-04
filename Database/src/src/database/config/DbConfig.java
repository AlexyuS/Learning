package src.database.config;

import java.sql.SQLException;
import java.util.Optional;
import java.util.Properties;


import javax.annotation.PreDestroy;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import src.database.constants.DatabaseConst;
import src.database.constants.HibernateConst;

@Configuration
@EnableTransactionManagement
@PropertySources({ @PropertySource("classpath:application.properties"),
		@PropertySource("classpath:hibernate.properties") })
@EnableJpaAuditing(auditorAwareRef="auditorProvider")
@Import(RepositoryRestMvcConfiguration .class)
@ComponentScan("src.database.services")
@EnableJpaRepositories("src.database.repositories")
public class DbConfig {
	public DbConfig() {
		System.out.println("Database configurator is ready");
	}

	@Autowired(required = true)
	Environment env;

	@Autowired
	DataSource dataSource;

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();

		Properties props = new Properties();
		props.setProperty(HibernateConst.CREATE_STRATEGY, env.getProperty(HibernateConst.CREATE_STRATEGY));
		props.setProperty(HibernateConst.DIALECT, env.getProperty(HibernateConst.DIALECT));
		props.setProperty(HibernateConst.DISPLAY_SQL_LOGS, env.getProperty(HibernateConst.DISPLAY_SQL_LOGS));
		props.setProperty(HibernateConst.FORMAT_SQL_LOGS, env.getProperty(HibernateConst.FORMAT_SQL_LOGS));
		props.setProperty(HibernateConst.APPEND_COMMENTS, env.getProperty(HibernateConst.APPEND_COMMENTS));

		em.setJpaProperties(props);
		em.setDataSource(dataSource);
		em.setPackagesToScan(new String[] { "src.database.model" });

		em.setJpaVendorAdapter(adapter);

		return em;
	}
	
	@Bean
	public RepositoryRestConfigurer repositoryRestConfigurer() {
		
		return new RepositoryRestConfigurer() {
			
			@Override
			public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
				config.setBasePath("/console");
			}
		};
	}

	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(emf);

		return transactionManager;
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName(env.getProperty(DatabaseConst.DRIVER));
		dataSource.setUsername(env.getProperty(DatabaseConst.USERNAME));
		dataSource.setPassword(env.getProperty(DatabaseConst.PASSWORD));
		dataSource.setUrl(env.getProperty(DatabaseConst.URL));

		return dataSource;
	}
	
	@Bean
    public AuditorAware<String> auditorProvider() {    
       // SecurityContextHolder.getContext().getAuthentication().getName();
        return () -> Optional.ofNullable("Alexyus");
    }
	
	

	@PreDestroy
	public void cleanUp() {
		if (dataSource != null) {
			try {
				dataSource.getConnection().close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
