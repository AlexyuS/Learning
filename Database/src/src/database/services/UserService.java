package src.database.services;

import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import src.database.model.User;

public interface UserService {
	
	@Transactional
	public void persistUser(User user) ;
	
	@Transactional
	public Optional<User> findUserById(Long id);
	
	@Transactional
	public void deleteUser(User user);
	
}
