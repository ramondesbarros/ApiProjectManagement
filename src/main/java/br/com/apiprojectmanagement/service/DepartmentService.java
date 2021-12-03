package br.com.apiprojectmanagement.service;

import java.util.List;
import java.util.Optional;

import br.com.apiprojectmanagement.dto.Department;

public interface DepartmentService {

	void create(Department department);

	Optional<Department> read(Long id);

	void updatePut(Department department, Long id);

	void updatePath(Department department, Long id);

	void delete(Department department);

	List<Department> readAll();

}
