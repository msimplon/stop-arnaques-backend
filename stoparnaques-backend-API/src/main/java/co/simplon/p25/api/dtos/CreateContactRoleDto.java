package co.simplon.p25.api.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import co.simplon.p25.api.validators.UniqueContactRoleName;
import co.simplon.p25.api.validators.UniqueRoleCode;

public class CreateContactRoleDto {

    @NotBlank
    @Size(min = 1, max = 5)
    @Pattern(regexp = "[A-Z]+")
    @UniqueRoleCode
    private String roleCode;

    @NotBlank
    @Size(min = 1, max = 100)
    @Pattern(regexp = "[a-zA-Z]+")
    @UniqueContactRoleName
    private String contactRoleName;

    public String getRoleCode() {
	return roleCode;
    }

    public void setRoleCode(String roleCode) {
	this.roleCode = roleCode;
    }

    public String getContactRoleName() {
	return contactRoleName;
    }

    public void setContactRoleName(String contactRoleName) {
	this.contactRoleName = contactRoleName;
    }

    @Override
    public String toString() {
	return "{roleCode=" + roleCode
		+ ", contactRoleName=" + contactRoleName
		+ "}";
    }
}
