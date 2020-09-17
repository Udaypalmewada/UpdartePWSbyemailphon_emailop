package com.url.app.bean;

public class FogetRequest {
	private String email;
	private String phonNumber;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonNumber() {
		return phonNumber;
	}

	public void setPhonNumber(String phonNumber) {
		this.phonNumber = phonNumber;
	}

	@Override
	public String toString() {
		return "FogetRequest [email=" + email + ", phonNumber=" + phonNumber + "]";
	}

}
