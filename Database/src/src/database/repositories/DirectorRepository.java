package src.database.repositories;



import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import src.database.model.Director;



@RepositoryRestResource(collectionResourceRel = "directors", path = "director")
public interface DirectorRepository extends CrudRepository<Director, Long> {
	
}
