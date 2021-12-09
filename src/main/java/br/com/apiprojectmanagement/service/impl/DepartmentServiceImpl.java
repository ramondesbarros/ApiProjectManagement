package br.com.apiprojectmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apiprojectmanagement.dto.Department;
import br.com.apiprojectmanagement.dto.DepartmentRequest;
import br.com.apiprojectmanagement.integration.DepartmentRepository;
import br.com.apiprojectmanagement.map.DepartmentMapper;
import br.com.apiprojectmanagement.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private DepartmentMapper departmentMapper;

	@Override
	public void create(Department department) {

		departmentRepository.save(department);
	}

	@Override
	public Optional<Department> read(Long id) {

		return departmentRepository.findById(id.intValue());
	}

	@Override
	public void updatePut(Department department, Long id) {
		// TODO Auto-generated method stub
	}

	@Override
	public void updatePath(DepartmentRequest departmentRequest, Long id) {

		departmentRepository.save(departmentMapper.map(departmentRequest, id));
	}

	@Override
	public void delete(Department department) {

		departmentRepository.delete(department);
	}

	@Override
	public List<Department> readAll() {

		List<Department> departmentAll = departmentRepository.findAll();

		return departmentAll;
	}

}
