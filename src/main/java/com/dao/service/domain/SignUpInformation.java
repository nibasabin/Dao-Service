package com.dao.service.domain;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class SignUpInformation {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="SignUpId")
private Long signUpId;

@Column(name="FirstName")
private String firstName;

@Column(name="LastName")
private String lastName;

@Column(name="ContactNo")
private Long contactNo;

@Column(name="Password")
private String password;

@Column(name="DateOfBirth")
private Date dateOfBirth;

@Column(name="Sex")
private String sex;

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
public Long getContactNo() {
	return contactNo;
}
public void setContactNo(Long contactNo) {
	this.contactNo = contactNo;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Date getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}


}
