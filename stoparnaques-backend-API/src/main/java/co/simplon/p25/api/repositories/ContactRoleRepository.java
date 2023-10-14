package co.simplon.p25.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.p25.api.entities.ContactRole;

public interface ContactRoleRepository
	extends JpaRepository<ContactRole, Long> {

    boolean existsByRoleCode(String string);

    boolean existsByContactRoleName(String string);

}