package src.database.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
import src.database.model.constants.JobType;
import src.database.model.constants.Role;


@Entity
@Table(name="Manager")
public class Manager extends Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JobType jobType;

	public JobType getJobType() {
		return jobType;
	}

	@Override
	public String getRoleName() {
		return Role.MANAGER.toString();
	}
}
