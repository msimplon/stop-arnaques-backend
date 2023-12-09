package co.simplon.p25.api.repositories;

import java.util.Collection;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.p25.api.dtos.Request.RequestView;
import co.simplon.p25.api.entities.Request;

public interface RequestRepository
	extends JpaRepository<Request, Long> {

    Optional<RequestView> findProjectedById(Long id);

    Collection<RequestView> findAllProjectedBy();

}
