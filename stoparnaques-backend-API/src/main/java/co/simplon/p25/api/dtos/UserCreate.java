package co.simplon.p25.api.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class UserCreate {

	private long id;

	@NotBlank(message = "email_required")
//	@UniqueEmail(message = "Cet email existe déjà")
	@Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "email_format")
	private String username;

	@NotBlank(message = "password_required")
	@Pattern(regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$")
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

}
