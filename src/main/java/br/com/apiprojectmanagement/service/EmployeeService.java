package br.com.apiprojectmanagement.service;

import java.util.List;
import java.util.Optional;

import br.com.apiprojectmanagement.dto.Employee;

public interface EmployeeService {

	void create(Employee employee);

	Optional<Employee> read(Long id);

	void updatePut(Employee employee, Long id);

	void updatePath(Employee employee, Long id);

	void delete(Employee employee);

	List<Employee> readAll();

}
