package co.simplon.p25.api.dtos;

import java.time.LocalDateTime;

public interface UserProfile {

    Long getId();

    String getFirstName();

    String getLastName();

    String getEmail();

    long getPointsNumber();

    LocalDateTime getRegistrationDate();

}
