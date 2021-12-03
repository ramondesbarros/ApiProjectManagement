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
import org.springframework.web.bind.annotation.RestController;

import br.com.apiprojectmanagement.dto.Department;
import br.com.apiprojectmanagement.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping
	void create(@RequestBody Department department) {
		
		departmentService.create(department);
	}

	
	Optional<Department> read(Long id) {
		
		return departmentService.read(id);
	}

	@PutMapping
	void updatePut(Department department, Long id) {
		
	}

	@PatchMapping
	void updatePath(Department department, Long id) {
		
	}

	@DeleteMapping
	void delete(Department department) {
		departmentService.delete(department);
	}

	@GetMapping
	List<Department> readAll() {
		
		return departmentService.readAll();
	}

}
