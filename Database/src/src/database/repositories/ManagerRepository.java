package src.database.repositories;



import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import src.database.model.Manager;



@RepositoryRestResource(collectionResourceRel = "managers", path = "manager" )
public interface ManagerRepository extends CrudRepository<Manager, Long> {
	
}
