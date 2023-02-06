package co.simplon.p25.api.dtos;

import java.time.LocalDate;

import co.simplon.p25.api.entities.Litige;

public interface RequestView {

    Long getId();

    Litige getLitige();

    LocalDate getCreatedAt();

    String description();

}
