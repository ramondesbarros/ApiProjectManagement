package br.com.apiprojectmanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apiprojectmanagement.dto.Employee;
import br.com.apiprojectmanagement.dto.EmployeeRequest;
import br.com.apiprojectmanagement.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping
	void create(@RequestBody Employee employee) {

		employeeService.create(employee);
	}

	Optional<Employee> read(Long id) {

		return employeeService.read(id);
	}

	@PutMapping("/{id}")
	void updatePut(@RequestBody Employee employee, @PathVariable Long id) {
		employeeService.updatePut(employee, id);
	}

	@PatchMapping("/{id}")
	void updatePath(@RequestBody EmployeeRequest employeeRequest, @PathVariable Long id) {
		employeeService.updatePath(employeeRequest, id);
	}

	@DeleteMapping
	void delete(Employee employee) {

		employeeService.delete(employee);
	}

	@GetMapping
	List<Employee> readAll() {

		return employeeService.readAll();
	}

}
