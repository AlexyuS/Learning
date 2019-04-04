package src.database.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import src.database.model.constants.JobType;
import src.database.model.constants.Role;

@Entity
@Table(name="Admin")
public class Admin  extends Employee implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

	public JobType getJobType() {
		return jobType;
	}

	public String getRoleName() {
		return Role.ADMIN.toString();
	}
	
}
