package co.simplon.p25.api.dtos.Articles;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface ArticleView {

    String getTitle();

    String getSubTitle();

    String getEditor();

    String getDescription();

    String getIntroduction();

    String getImageUrl();

    LocalDateTime getCreatedAt();

    Long getId();

    String getCategoryName();

    Long getCategoryId();

    LocalDate getDate();

}
