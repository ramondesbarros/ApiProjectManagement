package br.com.restapienterprisemanagement.controller;

import java.util.Optional;

import javax.validation.Valid;

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

import br.com.restapienterprisemanagement.dto.Department;
import br.com.restapienterprisemanagement.dto.DepartmentRequest;
import br.com.restapienterprisemanagement.service.DepartmentService;


@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping
	void create(@Valid @RequestBody Department department) {

		departmentService.create(department);
	}

	@GetMapping("/{id}")
	Optional<Department> read(Long id) {

		return departmentService.read(id);
	}

	@PutMapping
	void updatePut(Department department, Long id) {

	}

	@PatchMapping("/{id}")
	void updatePath(@Valid @RequestBody DepartmentRequest departmentRequest, @PathVariable Long id) {
		departmentService.updatePath(departmentRequest, id);
	}

	@DeleteMapping
	void delete(Department department) {
		departmentService.delete(department);
	}

}
