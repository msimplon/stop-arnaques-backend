package co.simplon.p25.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="articles")
public class Article {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "titre")
    private String name;
	
	@Column(name = "subtitle")
    private String title;
	
	@Column(name = "description")
    private String description;
	
	
	@Column(name = "date of publication")
    private int date;
	
}
	
