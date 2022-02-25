package pl.projekty.springboocrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.projekty.springboocrud.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
