package co.simplon.p25.api.service;

import org.springframework.stereotype.Service;

import co.simplon.p25.api.entities.Country;
import co.simplon.p25.api.repositories.CountryRepository;


@Service
public class RestCountriesServiceImpl implements RestCountriesService{
	private final CountryRepository repository;
	public RestCountriesServiceImpl (CountryRepository repository) {
		this.repository =repository;
	}
@Override	
public Country getById(long id){
	return repository.findById(id).get();
}
}