package co.simplon.p25.api.dtos.Articles;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

import co.simplon.p25.api.validators.ImageSize;
import co.simplon.p25.api.validators.ImageType;

public class ArticleCreate {

    @NotNull
    private String title;
    @NotNull
    private String subTitle;
    @NotNull
    private String editor;
    @NotNull
    private String description;

    @ImageType
    @ImageSize(maxValue = 2097152L)
    @NotNull
    private MultipartFile imageUrl;

    @NotNull
    private LocalDate date;

    @NotNull
    private Long categoryId;

    @NotNull
    private String introduction;

    public ArticleCreate() {

    }

    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public String getSubTitle() {
	return subTitle;
    }

    public void setSubTitle(String subTitle) {
	this.subTitle = subTitle;
    }

    public String getEditor() {
	return editor;
    }

    public void setEditor(String editor) {
	this.editor = editor;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public MultipartFile getImageUrl() {
	return imageUrl;
    }

    public void setImageUrl(MultipartFile imageUrl) {
	this.imageUrl = imageUrl;
    }

    public LocalDate getDate() {
	return date;
    }

    public void setDate(LocalDate date) {
	this.date = date;
    }

    public Long getCategoryId() {
	return categoryId;
    }

    public void setCategoryId(Long categoryId) {
	this.categoryId = categoryId;
    }

    public String getIntroduction() {
	return introduction;
    }

    public void setIntroduction(String introduction) {
	this.introduction = introduction;
    }

}
