package br.com.apiprojectmanagement.map.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.apiprojectmanagement.dto.Employee;
import br.com.apiprojectmanagement.dto.EmployeeRequest;
import br.com.apiprojectmanagement.integration.EmployeeRepository;
import br.com.apiprojectmanagement.map.EmployeeMapper;

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
