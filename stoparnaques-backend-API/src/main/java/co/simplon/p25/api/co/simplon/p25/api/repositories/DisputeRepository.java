package co.simplon.p25.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.p25.api.dtos.DisputeView;
import co.simplon.p25.api.entities.Dispute;

@Repository
public interface DisputeRepository
	extends JpaRepository<Dispute, Long> {

    List<DisputeView> findAllProjectedBy();

}
