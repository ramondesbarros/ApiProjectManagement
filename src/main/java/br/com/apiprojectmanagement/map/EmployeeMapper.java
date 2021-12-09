package br.com.apiprojectmanagement.map;

import br.com.apiprojectmanagement.dto.Employee;
import br.com.apiprojectmanagement.dto.EmployeeRequest;

public interface EmployeeMapper {


	public Employee map(EmployeeRequest employeeRequest, Long id);
}
