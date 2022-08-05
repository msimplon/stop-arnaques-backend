package co.simplon.p25.api.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "articles")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "subtitle")
    private String subTitle;

    @Column(name = "description")
    private String description;
    
    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "date_of_publication")
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Article() {

    }

    public Long getId() {
	return id;
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

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }
    
    public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public LocalDate getDate() {
	return date;
    }

    public void setDate(LocalDate date) {
	this.date = date;

    }

    public Category getCategory() {
	return category;
    }

    public void setCategory(Category category) {
	this.category = category;
    }

    @Override
    public String toString() {
	return "Article [id=" + id + ", title=" + title + ", subtitle=" + subTitle + ", description=" + description
		+ ", date=" + date + ", category=" + category + "]";
    }

}
