package co.simplon.p25.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setTitle(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", title=" + name + "]";
	}

}
