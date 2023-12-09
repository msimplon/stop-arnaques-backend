package co.simplon.p25.api.services;

import java.util.Collection;

import co.simplon.p25.api.dtos.Request.LitigeView;

public interface LitigeService {

    Collection<LitigeView> findAll();

}
