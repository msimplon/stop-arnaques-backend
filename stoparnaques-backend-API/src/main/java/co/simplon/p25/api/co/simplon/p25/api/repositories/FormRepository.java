package co.simplon.p25.api.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.p25.api.entities.Form;

@Repository
public interface FormRepository
	extends JpaRepository<Form, Long> {

    Optional<Form> findProjectedById(Long id);

    List<Form> findAllProjectedBy();
}
