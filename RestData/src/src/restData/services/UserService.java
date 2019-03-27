package src.restData.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import src.database.model.User;


public interface UserService {
	
	@Transactional
	public List<User> findUsers();
	
	@Transactional
	public void save(User user);
}
