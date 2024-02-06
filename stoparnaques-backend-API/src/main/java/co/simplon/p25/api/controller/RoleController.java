package co.simplon.p25.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.api.dtos.RoleView;
import co.simplon.p25.api.services.RoleService;

@CrossOrigin
@RestController
@RequestMapping("/roles")
public class RoleController {

    private final RoleService service;

    public RoleController(RoleService service) {
	this.service = service;
    }

    @GetMapping
    public List<RoleView> findAll() {
	return service.findAll();
    }

}
