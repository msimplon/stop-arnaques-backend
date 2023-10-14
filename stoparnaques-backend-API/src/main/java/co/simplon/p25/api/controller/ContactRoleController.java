package co.simplon.p25.api.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.api.dtos.CreateContactRoleDto;
import co.simplon.p25.api.services.ContactRoleService;

@RestController
@RequestMapping("/contact-roles")
public class ContactRoleController {

    private final ContactRoleService service;

    public ContactRoleController(
	    ContactRoleService service) {
	this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void create(
	    @Valid @RequestBody CreateContactRoleDto inputs) {
	service.create(inputs);
    }

}