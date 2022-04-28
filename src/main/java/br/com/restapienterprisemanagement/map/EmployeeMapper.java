package br.com.restapienterprisemanagement.map;

import br.com.restapienterprisemanagement.dto.Employee;
import br.com.restapienterprisemanagement.dto.EmployeeRequest;

public interface EmployeeMapper {


	public Employee map(EmployeeRequest employeeRequest, Long id);
}
