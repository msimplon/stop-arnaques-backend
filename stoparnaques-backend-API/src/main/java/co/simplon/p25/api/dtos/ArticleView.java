package co.simplon.p25.api.dtos;

import java.time.LocalDate;

public interface ArticleView {

    String getTitle();

    String getSubTitle();

    String getImageUrl();

    String getDescription();

    LocalDate getDate();

    Long getId();

    Long getCategoryId();

}
