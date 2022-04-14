package br.com.apiprojectmanagement.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ProjectRequest {

	@NotNull
	@Size(min=2, max=30)
	private String name;

	@NotNull
	private String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
