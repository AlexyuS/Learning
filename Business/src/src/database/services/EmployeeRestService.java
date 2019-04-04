package src.database.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import src.database.model.Employee;

public interface EmployeeRestService {
	@Transactional
	public List<Employee> getEmployees();
}
