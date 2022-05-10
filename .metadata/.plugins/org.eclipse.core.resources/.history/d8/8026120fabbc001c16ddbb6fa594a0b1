package co.simplon.p25.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.api.service.RestCountriesService;

@RestController
@RequestMapping ("/restCountries")
public class restCountriesController{
	private final RestCountriesService service;
	
	public restCountriesController(RestCountriesService service){
		this.service = service;}
	
	@GetMapping("/{id}")
	public RestCountriesService getById (@PathVariable("id") Long id){
		return ((restCountriesController) service).getById(id);
	}
}