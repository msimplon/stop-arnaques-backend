package co.simplon.p25.api.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.p25.api.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsernameIgnoreCase(String username);

}
