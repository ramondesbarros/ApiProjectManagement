package br.com.apiprojectmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apiprojectmanagement.dto.Employee;
import br.com.apiprojectmanagement.dto.EmployeeRequest;
import br.com.apiprojectmanagement.integration.EmployeeRepository;
import br.com.apiprojectmanagement.map.EmployeeMapper;
import br.com.apiprojectmanagement.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private EmployeeMapper employeeMapper;

	@Override
	public void create(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public Optional<Employee> read(Long id) {
		return employeeRepository.findById(id.intValue());
	}

	@Override
	public void updatePut(Employee employee, Long id) {
		// TODO Auto-generated method stub
	}

	@Override
	public void updatePath(EmployeeRequest employeeRequest, Long id) {

		employeeRepository.save(employeeMapper.map(employeeRequest, id));
	}

	@Override
	public void delete(Employee employee) {
		
		employeeRepository.delete(employee);
	}

	@Override
	public List<Employee> readAll() {
		
		return employeeRepository.findAll();
	}
}
