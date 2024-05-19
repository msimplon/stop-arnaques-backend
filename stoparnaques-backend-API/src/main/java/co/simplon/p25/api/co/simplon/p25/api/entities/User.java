package co.simplon.p25.api.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")

public class User extends AbstractEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    public User() {

    }

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

    // on fait des getID car on en a besoin dans le front
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

    public Role getRole() {
	return role;
    }

    public void setRole(Role role) {
	this.role = role;
    }

// REDEFENIR hschode et equals car bonne pratique et etre implémnté sur la meme donnée que equals 
    @Override
    public int hashCode() {
	return Objects.hash(username);
    }

    // username est notre discriminant est cest ca qui vient donner l'identité
    // logique de mon entité pourtan tpas dans le monde relationnelle et donc meme
    // dans les traiteents on a besoin d'identifié un discriminant fonctionelle

    /**
     * on a equals donc la meme signature this == obj : necesssairement le meme
     * type, la meme référence et donc utile pour els performances
     */// si pas le meme type ca sert a rien de continuer ici ca verifie si lestypes
       // sont compatible sinon return false
       // ici on sait que is_a account , ici on a un cast ca permet à la compilation ca
       // permet de voir objt comme un user et donc on stocke objt comme un user.

    @Override
    public boolean equals(Object obj) {
	if (this == obj) {
	    return true;
	}
	return obj instanceof User other
		&& Objects.equals(username, other.username);
    }

    @Override
    public String toString() {
	return "{firstName=" + firstName + ", lastName="
		+ lastName + ", username=" + username
		+ ", password=" + password + ", role="
		+ role + "}";
    }

}
