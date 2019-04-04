package src.database.repositories;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import src.database.model.Employee;



@RepositoryRestResource(collectionResourceRel = "employees", path = "employee")
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
	
}
