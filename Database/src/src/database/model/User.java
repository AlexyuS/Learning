package src.database.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import src.database.model.constants.Gender;
import src.database.model.constants.Role;

@Entity
@Table(name="user_entity")
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	
	@Column(name="FirstName")
	private String firstName;
	
	@Column(name="Surename")
	private String surename;
	
	@Column(name="Age")
	private byte age;
	
	@Column(name="Gender")
	private Gender gender;
	
	@Column(name="Role")
	private Role role;

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", surename=" + surename + ", age=" + age + ", gender="
				+ gender + ", role=" + role + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurename() {
		return surename;
	}

	public void setSurename(String surename) {
		this.surename = surename;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
}
