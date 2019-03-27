package src.com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import src.com.model.UserDTO;
import src.database.model.User;
import src.database.model.constants.Gender;
import src.database.model.constants.Role;
import src.restData.services.UserService;

@Controller
public class MainController {

	@Autowired
	UserService repo;

	@Autowired
	DataSource dataSource;

	@RequestMapping("/init")
	public ModelAndView displayFirstPage() {
		UserDTO users = getUsers();
		return new ModelAndView("users","userDTO",users);
	}

	@RequestMapping(path = "createUser")
	public ModelAndView createUser() {
		return new ModelAndView("createUser");
	}
	public void createUsers() {

		User newUser = new User();
		newUser.setAge((byte) 25);
		newUser.setFirstName("Jhon");
		newUser.setSurename("Doe");
		newUser.setGender(Gender.MALE);
		newUser.setRole(Role.ADMIN);
		try {
			repo.save(newUser);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@RequestMapping(method = RequestMethod.GET, path = "getUsers")
	@ResponseBody
	public UserDTO getUsers() {
		List<User> usersAsList = repo.findUsers();

		UserDTO dto = new UserDTO();
		dto.setUsers(usersAsList);

		return dto;
	}
}
