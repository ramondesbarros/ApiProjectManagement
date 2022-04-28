package br.com.restapienterprisemanagement.map;

import br.com.restapienterprisemanagement.dto.Department;
import br.com.restapienterprisemanagement.dto.DepartmentRequest;

public interface DepartmentMapper {

	public Department map(DepartmentRequest employeeRequest, Long id);

}
