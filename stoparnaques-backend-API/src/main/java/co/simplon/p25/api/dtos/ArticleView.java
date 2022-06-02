package co.simplon.p25.api.dtos;

import java.time.LocalDate;

public interface ArticleView {

	String getTitle();

	String getSubtitle();

	String getDescription();

	LocalDate getDate();

//	String getCategoryName();
	
	Long getId();

}
