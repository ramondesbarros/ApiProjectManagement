package br.com.apiprojectmanagement.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

public class ManagerRequest {

	@NotNull
	@Size(min=2, max=30)
	private String name;

	@NonNull
	@Email
	private String email;

	@NotNull
	@Size(min=10, max=11)
	private String phone;

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
