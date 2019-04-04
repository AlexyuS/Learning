package src.database.repositories;



import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import src.database.model.Janitor;




@RepositoryRestResource(collectionResourceRel = "janitors", path = "janitor" )
public interface JanitorRepository extends CrudRepository<Janitor, Long> {
	
}
