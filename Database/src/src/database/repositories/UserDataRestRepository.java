package src.database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import src.database.model.User;

@Repository
public interface UserDataRestRepository extends JpaRepository<User, Long>{

}
