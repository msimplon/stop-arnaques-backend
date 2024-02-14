package co.simplon.p25.api.dtos;

import org.springframework.web.multipart.MultipartFile;

public interface Form {
    String object();

    String email();

    String incidentNumber();

    MultipartFile attachement();

    String detail();
}
