package co.simplon.p25.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.p25.api.dtos.RoleView;
import co.simplon.p25.api.entities.Role;

public interface RoleRepository
	extends JpaRepository<Role, Long> {
    List<RoleView> findAllProjectedBy();

}
