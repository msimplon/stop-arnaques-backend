package co.simplon.p25.api.dtos;

import java.time.LocalDate;

public interface ArticleView {

    String getTitle();

    String getSubTitle();

    String getEditor();

//    String getDescription();

    String getIntroduction();

    String getImageUrl();

    Long getId();

    String getCategoryName();

//    Long getCategoryId();

    LocalDate getDate();

}
