package co.simplon.p25.api.controller;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.api.dtos.RequestCreateDto;
import co.simplon.p25.api.dtos.RequestView;
import co.simplon.p25.api.services.RequestService;

@RestController
@RequestMapping("/requests")
@CrossOrigin
public class RequestController {

    private RequestService service;

    public RequestController(RequestService service) {
	this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void create(
	    @Valid @RequestBody RequestCreateDto inputs) {
	service.create(inputs);
    }

    @GetMapping("/list-requests")
    public Collection<RequestView> getAllRequests() {
	return service.getAllRequests();

    }

    @GetMapping("/list-requests/{id}")
    public RequestView getRequestById(
	    @PathVariable("id") Long id) {
	return service.findProjectedById(id);
    }

    @DeleteMapping("/byId/{id}")
    public void deleteArticleById(
	    @PathVariable("id") Long id) {
	service.deleteRequestById(id);
    }

}
