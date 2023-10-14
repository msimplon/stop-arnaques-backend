package co.simplon.p25.api.services;

import co.simplon.p25.api.dtos.EmailTemplateDto;

public interface EmailTemplateService {

    void update(Long id, EmailTemplateDto inputs);
}
