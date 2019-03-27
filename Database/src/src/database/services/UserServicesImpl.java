package src.database.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import src.database.model.User;
import src.database.repositories.UserDataRestRepository;


@Service("UserService")
public class UserServicesImpl implements UserService {
	@Autowired
	private UserDataRestRepository userRepo;
	
	
    UserServicesImpl(){
		System.out.println("Service class has been instantiated");
	}
	
	@Transactional
	public void persistUser(User user) {
		userRepo.save(user);
	}
	
	@Transactional
	public Optional<User> findUserById(Long id) {
		return userRepo.findById(id);
	}
	
	@Transactional
	public void deleteUser(User user) {
		userRepo.delete(user);
	}
}
