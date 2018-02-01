package com.niit.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@SuppressWarnings("unused")
@Entity
@Table(name = "User")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "User_ID")
	private int id;
	@Column(name = "User_Name", nullable = false)
	private String name;
	@Column(name = "Mob_No", nullable = false)
	private long mobno;
	@Column(name = "Email", nullable = false)
	private String email;
	@Column(name = "Password", nullable = false)
	private String Password;
	@Column(name = "Address", nullable = false)
	private String address;
	private String role;

	// getters and setters

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobno() {
		return mobno;
	}

	public void setMobno(long mobno) {
		this.mobno = mobno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	// to string method

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mobno=" + mobno + ", email=" + email + ", Password=" + Password
				+ ", address=" + address + ", role=" + role + "]";
	}

}
