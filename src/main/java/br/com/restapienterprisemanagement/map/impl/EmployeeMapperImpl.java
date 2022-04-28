package br.com.restapienterprisemanagement.map.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.restapienterprisemanagement.dto.Employee;
import br.com.restapienterprisemanagement.dto.EmployeeRequest;
import br.com.restapienterprisemanagement.integration.EmployeeRepository;
import br.com.restapienterprisemanagement.map.EmployeeMapper;

@Component
public class EmployeeMapperImpl implements EmployeeMapper {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee map(EmployeeRequest employeeRequest, Long id) {

		Employee employee = employeeRepository.findById(id);

		if (employeeRequest.getName() != null) {
			employee.setName(employeeRequest.getName());
		}

		if (employeeRequest.getEmail() != null) {
			employee.setEmail(employeeRequest.getEmail());
		}

		if (employeeRequest.getPhone() != null) {
			employee.setPhone(employeeRequest.getPhone());
		}

		return employee;
	}

}
