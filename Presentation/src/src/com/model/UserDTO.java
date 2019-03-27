package src.com.model;

import java.util.List;

import src.database.model.User;

public class UserDTO {
	List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
}
