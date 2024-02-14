package co.simplon.p25.api.services;

import java.util.List;

import co.simplon.p25.api.dtos.DisputeView;

public interface DisputeService {

    List<DisputeView> findAll();

}
