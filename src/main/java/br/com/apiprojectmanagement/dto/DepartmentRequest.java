package br.com.apiprojectmanagement.dto;

import br.com.apiprojectmanagement.enums.Local;

public class DepartmentRequest {

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
