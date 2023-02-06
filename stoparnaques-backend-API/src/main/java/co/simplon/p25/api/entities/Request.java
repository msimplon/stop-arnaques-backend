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
@Table(name = "requests")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "created_at", updatable = false)
    private LocalDate createdAt;

    @Column(name = "description")
    private String description;

    @JoinColumn(name = "litige_id")
    @ManyToOne
    private Litige litige;

    public Request() {
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public LocalDate getCreatedAt() {
	return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
	this.createdAt = createdAt;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public Litige getLitige() {
	return litige;
    }

    public void setLitige(Litige litige) {
	this.litige = litige;
    }

    @Override
    public String toString() {
	return "{id=" + id + ", createdAt=" + createdAt
		+ ", description=" + description + "}";
    }

}
