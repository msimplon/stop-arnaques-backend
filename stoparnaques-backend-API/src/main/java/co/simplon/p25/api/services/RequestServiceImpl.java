package co.simplon.p25.api.services;

import java.time.LocalDate;
import java.util.Collection;

import org.springframework.stereotype.Service;

import co.simplon.p25.api.dtos.RequestCreateDto;
import co.simplon.p25.api.dtos.RequestView;
import co.simplon.p25.api.entities.Litige;
import co.simplon.p25.api.entities.Request;
import co.simplon.p25.api.repositories.LitigeRepository;
import co.simplon.p25.api.repositories.RequestRepository;

@Service
public class RequestServiceImpl implements RequestService {

    private RequestRepository requests;

    private LitigeRepository litiges;

    public RequestServiceImpl(RequestRepository requests,
	    LitigeRepository litiges) {
	this.requests = requests;
	this.litiges = litiges;

    }

    @Override
    public Collection<RequestView> getAllRequests() {
	return requests.findAllProjectedBy();
    }

    @Override
    public void create(RequestCreateDto inputs) {
	Request request = new Request();
	Long litigeId = inputs.getLitigeId();
	Litige litige = litiges
		.getById(inputs.getLitigeId());
	System.out.println(litigeId);
	request.setLitige(litige);
	LocalDate createdAt = LocalDate.now();
	request.setCreatedAt(createdAt);
	request.setDescription(inputs.getDescription());
	this.requests.save(request);

    }

    @Override
    public RequestView findProjectedById(Long id) {
	return requests.findProjectedById(id).get();
    }

    @Override
    public void deleteRequestById(Long id) {
	requests.deleteById(id);
    }

}
