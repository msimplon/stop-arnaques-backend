package co.simplon.p25.api.dtos;

import org.springframework.web.multipart.MultipartFile;

public interface Form {
    String subject();

    String email();

    String incidentNumber();

    MultipartFile attachement();

    String detail();
}
