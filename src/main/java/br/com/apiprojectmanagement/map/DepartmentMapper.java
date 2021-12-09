package br.com.apiprojectmanagement.map;

import br.com.apiprojectmanagement.dto.Department;
import br.com.apiprojectmanagement.dto.DepartmentRequest;

public interface DepartmentMapper {

	public Department map(DepartmentRequest employeeRequest, Long id);

}
