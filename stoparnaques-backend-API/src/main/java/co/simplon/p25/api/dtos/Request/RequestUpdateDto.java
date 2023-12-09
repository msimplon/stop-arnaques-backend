package co.simplon.p25.api.dtos.Request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class RequestUpdateDto {

    @NotNull
    private Long litigeId;

    @NotBlank
    private String description;

    public RequestUpdateDto() {
	super();
    }

    public Long getLitigeId() {
	return litigeId;
    }

    public void setLitigeId(Long litigeId) {
	this.litigeId = litigeId;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    @Override
    public String toString() {
	return "{litigeId=" + litigeId + ", description="
		+ description + "}";
    }

}
