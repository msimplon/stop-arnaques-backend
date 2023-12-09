package co.simplon.p25.api.dtos.Request;

import co.simplon.p25.api.entities.Litige;

public interface RequestView {

    Long getId();

    Litige getLitige();

    String getDescription();

}
