package com.brycenorthrup.lockpickingapp.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames="email"))
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long userId;
	@NotNull
	private String name;
	@NotNull
	private String email;
	@NotNull
	private String password;
	@ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    private Collection<Role> roles;
	
	public User(){}
	
	public User( String name, String email, String password, Collection<Role> roles) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}
	
	public User(Long userId, String name, String email, String password) {
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }

	@Override
	public String toString() {
		return "User: " + name + " has the email: " + email + " and a password containing " + password.length() + " characters.";
	}
	
}
