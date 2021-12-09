package br.com.apiprojectmanagement.service;

import java.util.List;
import java.util.Optional;

import br.com.apiprojectmanagement.dto.Department;
import br.com.apiprojectmanagement.dto.DepartmentRequest;

public interface DepartmentService {

	void create(Department department);

	Optional<Department> read(Long id);

	void updatePut(Department department, Long id);

	void updatePath(DepartmentRequest departmentRequest, Long id);

	void delete(Department department);

	List<Department> readAll();

}
