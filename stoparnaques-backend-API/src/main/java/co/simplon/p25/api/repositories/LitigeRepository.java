package co.simplon.p25.api.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.p25.api.dtos.LitigeView;
import co.simplon.p25.api.entities.Litige;

public interface LitigeRepository
	extends JpaRepository<Litige, Long> {

    Collection<LitigeView> findAllProjectedBy();

}
