package co.simplon.p25.api.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import co.simplon.p25.api.exception.UniqueUserConstraint;


public class UserCreate {

	private long id;

	@NotBlank(message = "email_required")
	@UniqueUserConstraint(message = "email_uniq")
	private String username;

	@NotBlank(message = "password_required")
	@Pattern(regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$", message = "password_format")
	private String password;

	public UserCreate() {
	}

	public UserCreate(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	@Override
	   public String toString() {
		return String.format("ProfileCreate [username=%s, password=%s]",
			username, "[PROTECTED]");
	    }
	
//	return "UserResetPasswordDto [email=" + email
//			+ ", oldPassword=[PROTECTED], newPassword=[PROTECTED]]";
}


