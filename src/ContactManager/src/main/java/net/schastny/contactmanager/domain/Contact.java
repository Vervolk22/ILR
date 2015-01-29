package net.schastny.contactmanager.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;

@Entity
@Table(name = "CONTACT")
public class Contact {

	@Id
	@Column(name = "ID")
	@GeneratedValue
	private Integer id;

	@NotNull
	@Column(name = "FIRSTNAME")
	@Size(min=2, max=30)
	private String firstname;

	@NotNull
	@Column(name = "LASTNAME")
	@Size(min=8, max=20)
	private String lastname;

	@NotNull
	@Column(name = "EMAIL")
	@Size(min=8, max=20)
	private String email;

	@Column(name = "TELEPHONE")
	private String telephone;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	// Getters and setters
	
}