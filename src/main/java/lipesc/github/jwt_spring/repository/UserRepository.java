package lipesc.github.jwt_spring.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import lipesc.github.jwt_spring.model.User;


public interface UserRepository extends CrudRepository<User, String> {
  Optional<User> findByUsername(String username);
}

