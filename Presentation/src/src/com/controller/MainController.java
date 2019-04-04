package src.com.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import src.com.model.ModelForView;
import src.database.model.Manager;
import src.database.model.constants.EnumerationData;
import src.database.model.constants.Gender;
import src.database.model.constants.JobType;
import src.database.model.constants.Role;
import src.database.services.EmployeeRestService;

@Controller
public class MainController {
	@Autowired
	EmployeeRestService service;
	
	@GetMapping("displayEmployees")
	public ModelAndView displayUsers(HttpServletRequest req) {
		ModelForView model = new ModelForView();
		model.setEmployee(service.getEmployees());
		
		ModelAndView mv = new ModelAndView("Employee","modelDTO",model);
		return mv;
	}
	
	@RequestMapping("/")
	public ModelAndView menu() {
		return new ModelAndView("menu");
	}

	@GetMapping(path = "addEmployee")
	public ModelAndView createUser() {
		ModelAndView mv = new ModelAndView("createUser","employee", new Manager());
		mv.addObject("genderList", mapEnumsToString(Gender.values()));
		mv.addObject("roleList", mapEnumsToString(Role.values()));
		mv.addObject("jobType",mapEnumsToString(JobType.values()));
		return mv;
	}
	
	private  Map<EnumerationData,String> mapEnumsToString (EnumerationData t[]){
		
		List<EnumerationData> list =  Arrays.asList(t);
		Map<EnumerationData, String> roleToValue = list.stream().collect(Collectors.toMap(Function.identity(),e->e.getDescription()));
	
		return roleToValue;
	}

}
