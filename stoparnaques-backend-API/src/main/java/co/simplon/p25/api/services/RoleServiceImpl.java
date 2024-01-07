package co.simplon.p25.api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.p25.api.dtos.RoleView;
import co.simplon.p25.api.repositories.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roles;

    public RoleServiceImpl(RoleRepository roles) {
	this.roles = roles;
    }

    @Override
    public List<RoleView> findAll() {
	return roles.findAllProjectedBy();
    }

}
