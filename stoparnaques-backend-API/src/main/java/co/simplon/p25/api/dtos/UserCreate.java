package co.simplon.p25.api.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import co.simplon.p25.api.validators.UniqueUserConstraint;

public class UserCreate {

    @NotBlank
    @Size(min = 2, max = 30)
    private String firstName;

    @NotBlank
    @Size(min = 2, max = 100)
    private String lastName;

    @NotBlank(message = "email_required")
    @UniqueUserConstraint(message = "email_uniq")
    private String username;

    @NotBlank(message = "password_required")
    @Pattern(regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$", message = "password_format")
    private String password;

    private Long roleId;

    public UserCreate() {
    }

//    public UserCreate(String username, String password) {
//	this.username = username;
//	this.password = password;
//    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public Long getRoleId() {
	return roleId;
    }

    public void setRoleId(Long roleId) {
	this.roleId = roleId;
    }

    @Override
    public String toString() {
	return String.format(
		"ProfileCreate [username=%s, password=%s]",
		username, "[PROTECTED]");
    }

//	return "UserResetPasswordDto [email=" + email
//			+ ", oldPassword=[PROTECTED], newPassword=[PROTECTED]]";
}
