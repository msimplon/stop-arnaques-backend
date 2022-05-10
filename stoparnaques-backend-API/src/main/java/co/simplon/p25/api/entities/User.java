package co.simplon.p25.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (name = "username")
	private String username;
	
	@Column ( name="password")
	private String password;
	
	public Long getId() {
		return id;
	}
 public String getUsername() {
	 return username;
 }
public void setUsername (String username) {
	this.username = username;
}
public String getPassword () {
	return password;
}
}