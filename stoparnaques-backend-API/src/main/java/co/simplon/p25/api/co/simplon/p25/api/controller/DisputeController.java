package co.simplon.p25.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.api.dtos.DisputeView;
import co.simplon.p25.api.services.DisputeService;

@CrossOrigin
@RestController
@RequestMapping("/disputes")
public class DisputeController {

    private final DisputeService service;

    public DisputeController(DisputeService service) {
	this.service = service;
    }

    @GetMapping
    public List<DisputeView> findAll() {
	return service.findAll();
    }
}
