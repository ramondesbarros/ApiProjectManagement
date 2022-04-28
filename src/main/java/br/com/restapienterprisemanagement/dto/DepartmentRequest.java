package br.com.restapienterprisemanagement.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.restapienterprisemanagement.enums.Local;

public class DepartmentRequest {

	@NotNull
	@Size(min=2, max=30)
	private String name;

	private Local local;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

}
