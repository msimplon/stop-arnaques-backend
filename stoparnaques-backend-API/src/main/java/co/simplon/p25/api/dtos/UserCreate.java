package co.simplon.p25.api.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserCreate {

	private long id;

	@NotEmpty
	@Email
	private String username;

	@NotNull
	@NotEmpty
	@Size(min = 8, message = "Le mot de passe doit contenir au minimum 8 caractères, à savoir : au moins une lettre minuscule et une lettre majuscule, un caractère spécial et un chiffre")
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
		return "UserCreate [id=" + id + ", username=" + username + ", password=" + password + "]";
	}

}
