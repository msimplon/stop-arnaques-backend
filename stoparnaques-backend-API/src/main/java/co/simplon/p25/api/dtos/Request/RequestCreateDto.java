package co.simplon.p25.api.dtos.Request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class RequestCreateDto {

    @NotNull
    private Long litigeId;

    @NotBlank
    private String description;

    public RequestCreateDto() {
	super();
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public Long getLitigeId() {
	return litigeId;
    }

    public void setLitigeId(Long litigeId) {
	this.litigeId = litigeId;
    }

    @Override
    public String toString() {
	return "{description=" + description + ", litigeId="
		+ litigeId + "}";
    }

}
