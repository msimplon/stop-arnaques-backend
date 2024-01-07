package co.simplon.p25.api.services;

import java.util.List;

import co.simplon.p25.api.dtos.RoleView;

public interface RoleService {
    List<RoleView> findAll();

}
