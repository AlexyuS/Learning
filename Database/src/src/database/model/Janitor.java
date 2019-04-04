package src.database.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import src.database.model.constants.JobType;
import src.database.model.constants.Role;

@Entity
@Table(name="Janitor")
public class Janitor extends Employee {

	
	private JobType jobType;
	
	public JobType getJobType() {
		return jobType;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getRoleName() {
		return Role.JANITOR.toString();
	}
}
