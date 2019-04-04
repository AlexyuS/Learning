package src.database.repositories;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import src.database.model.Admin;



@RepositoryRestResource(collectionResourceRel = "admins", path="admin")
public interface AdminRepository extends PagingAndSortingRepository<Admin, Long> {
	
}
