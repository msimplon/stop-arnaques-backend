package co.simplon.p25.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/restCountries")
public class restCountriesController{
	private final restCountriesService service;
	
	public restCountriesController(restCountries service){
		this.service = service;
	}
	@GetMapping("/{id}")
	public restCountries getById (@PathVariable("id") Long id){
		return service.getById(id);
	}
}