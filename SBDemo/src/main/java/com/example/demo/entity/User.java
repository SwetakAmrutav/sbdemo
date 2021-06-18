package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "User Details")
@Entity
@JsonPropertyOrder({ "userId", "userName", "mobileNumber", "emailId" })
public class User {

	@ApiModelProperty(notes = "Auto generated User Id")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "user_id", nullable = false)
	@JsonProperty(value = "user_id")
	private long userId;

	@ApiModelProperty(notes = "User Name")
	@Column(name = "user_name")
	@JsonProperty(value = "user_name")
	private String userName;

	@ApiModelProperty(notes = "User Email ID")
	@Column(name = "email_id")
	@JsonProperty(value = "email_id")
	private String emailId;

	@ApiModelProperty(notes = "User Mobile Number")
	@Column(name = "mobile_number")
	@JsonProperty(value = "mobile_number")
	private String mobileNumber;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
}
