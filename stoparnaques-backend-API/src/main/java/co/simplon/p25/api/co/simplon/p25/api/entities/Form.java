package co.simplon.p25.api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "forms")
public class Form extends AbstractEntity {

    @Column(name = "object")
    private String object;

    @Column(name = "email")
    private String email;

    @Column(name = "incident_number")
    private String incidentNumber;

    @Column(name = "attachement")
    private String attachement;

    @Column(name = "details")
    private String details;

    @ManyToOne
    @JoinColumn(name = "dispute_id")
    private Dispute dispute;

    public Form() {

    }

    public String getObject() {
	return object;
    }

    public void setObject(String object) {
	this.object = object;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getIncidentNumber() {
	return incidentNumber;
    }

    public void setIncidentNumber(String incidentNumber) {
	this.incidentNumber = incidentNumber;
    }

    public String getAttachement() {
	return attachement;
    }

    public void setAttachement(String attachement) {
	this.attachement = attachement;
    }

    public Dispute getDispute() {
	return dispute;
    }

    public void setDispute(Dispute dispute) {
	this.dispute = dispute;
    }

    public String getDetails() {
	return details;
    }

    public void setDetails(String details) {
	this.details = details;
    }

    @Override
    public String toString() {
	return "{object=" + object + ", email=" + email
		+ ", incidentNumber=" + incidentNumber
		+ ", attachement=" + attachement
		+ ", dispute=" + dispute + "}";
    }

}
