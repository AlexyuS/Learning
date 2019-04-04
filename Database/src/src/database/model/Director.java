package src.database.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import src.database.model.constants.JobType;
import src.database.model.constants.Role;

@Entity
@Table(name="Director")
public class Director extends Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String getRoleName() {
		return Role.DIRECTOR.toString();
	}

	@Override
	public JobType getJobType() {
		return JobType.FULL_TIME;
	}
}
