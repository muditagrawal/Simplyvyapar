package org.mudit.Simplyvyapar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class User {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String username;
	private String firstname;
	private String lastname;
	private String password;
	private String email;
	@ManyToMany
	private Address address;
	
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

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public User(int id, String username, String firstname, String lastname, String password, String email) {
		super();
		this.id = id;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.email = email;
	}

	public User(String username, String firstname, String lastname, String password, String email) {
		super();
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.email = email;
	}

	public User() {
		super();
	}
	
}
