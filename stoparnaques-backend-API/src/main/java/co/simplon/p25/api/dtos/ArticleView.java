package co.simplon.p25.api.dtos;

import java.time.LocalDate;

public interface ArticleView {

    String getTitle();

    String getSubTitle();

    String getActor();

    String getDescription();

    String getImageUrl();

    LocalDate getDate();

    Long getId();

    Long getCategoryId();

}
