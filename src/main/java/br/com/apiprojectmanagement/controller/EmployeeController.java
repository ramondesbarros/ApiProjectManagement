package br.com.apiprojectmanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.apiprojectmanagement.dto.Employee;
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

	@PutMapping
	void updatePut(Employee employee, Long id) {

	}

	@PatchMapping
	void updatePath(Employee employee, Long id) {

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
