package co.simplon.p25.api.services;

import java.util.Collection;

import org.springframework.stereotype.Service;

import co.simplon.p25.api.dtos.Request.LitigeView;
import co.simplon.p25.api.repositories.LitigeRepository;

@Service
public class LitigeServiceImpl implements LitigeService {

    private LitigeRepository litiges;

    public LitigeServiceImpl(LitigeRepository litiges) {
	this.litiges = litiges;
    }

    @Override
    public Collection<LitigeView> findAll() {
	return litiges.findAllProjectedBy();
    }
}
