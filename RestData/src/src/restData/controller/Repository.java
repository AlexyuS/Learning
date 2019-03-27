package src.restData.controller;


import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import src.database.model.User;


@RepositoryRestResource(collectionResourceRel = "specialUsers", path = "specialUsers" )
public interface Repository extends PagingAndSortingRepository<User, Long> {
	
	@RestResource(exported=false)
	Iterable<User> findAll();

	@RestResource
	Optional<User> findById(@Param("id") long id);
}
