package src.restData.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import src.database.model.User;
import src.restData.controller.Repository;
import src.restData.services.UserService;

@Service("RestUserService")
public class UserServiceImpl implements UserService {

	@Autowired
	Repository userRepo;
	
	@Override
	public List<User> findUsers() {
		List<User> userList = new ArrayList<>();
		userRepo.findAll().forEach(userList::add);
		
		return userList;
	}

	@Override
	public void save(User user) {
		userRepo.save(user);
	}

}
