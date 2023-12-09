package co.simplon.p25.api.services;

import java.util.Collection;

import co.simplon.p25.api.dtos.Request.RequestCreateDto;
import co.simplon.p25.api.dtos.Request.RequestView;

public interface RequestService {

    void create(RequestCreateDto inputs);

    Collection<RequestView> getAllRequests();

    RequestView findProjectedById(Long id);

    void deleteRequestById(Long id);

}
