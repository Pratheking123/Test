package com.EnquiryManagement.entity;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
public class User {
	@Id
	private int id;

	private String userName;
	private String password;
	private String role;

	private String name;
	private String contactNumber;
	private String address;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String userName, String password, String role, String name, String contactNumber,
			String address) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.name = name;
		this.contactNumber = contactNumber;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Enquiry [id=" + id + ", userName=" + userName + ", password=" + password + ", role=" + role + ", name="
				+ name + ", contactNumber=" + contactNumber + ", address=" + address + "]";
	}

}
