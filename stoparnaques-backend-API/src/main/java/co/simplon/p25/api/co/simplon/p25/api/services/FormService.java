package co.simplon.p25.api.services;

import java.util.List;

import co.simplon.p25.api.dtos.FormCreate;
import co.simplon.p25.api.entities.Form;

public interface FormService {

    List<Form> getAllForm();

    void createForm(FormCreate form);

    Form findProjectedById(Long id);

}
