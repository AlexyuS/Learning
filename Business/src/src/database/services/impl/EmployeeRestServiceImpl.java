package src.database.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import src.database.model.Employee;
import src.database.repositories.EmployeeRepository;
import src.database.services.EmployeeRestService;

@Service("UserService")
class EmployeeRestServiceImpl implements EmployeeRestService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getEmployees() {
		List<Employee> users = new ArrayList<>();
		employeeRepository.findAll().forEach(user -> {
			users.add(user);
		});
		return users;
	}
}
