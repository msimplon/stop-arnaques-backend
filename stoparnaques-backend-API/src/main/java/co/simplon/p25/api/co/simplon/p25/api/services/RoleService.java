package co.simplon.p25.api.services;

import java.util.List;

import org.springframework.stereotype.Repository;

import co.simplon.p25.api.dtos.RoleView;

@Repository
public interface RoleService {
    List<RoleView> findAll();

}
