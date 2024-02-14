package co.simplon.p25.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.api.dtos.FormCreate;
import co.simplon.p25.api.entities.Form;
import co.simplon.p25.api.services.FormService;
import jakarta.validation.Valid;

@CrossOrigin
@RestController
@RequestMapping("/forms")
public class FormController {

    private final FormService service;

    public FormController(FormService service) {
	this.service = service;

    }

    @GetMapping("/list-forms")
    public List<Form> getAllForm() {
	return service.getAllForm();

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createForm(
	    @RequestBody @ModelAttribute @Valid FormCreate form) {
	service.createForm(form);
    }

}
