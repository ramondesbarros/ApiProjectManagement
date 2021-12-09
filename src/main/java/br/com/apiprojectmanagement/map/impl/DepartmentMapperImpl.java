package br.com.apiprojectmanagement.map.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.apiprojectmanagement.dto.Department;
import br.com.apiprojectmanagement.dto.DepartmentRequest;
import br.com.apiprojectmanagement.integration.DepartmentRepository;
import br.com.apiprojectmanagement.map.DepartmentMapper;

@Component
public class DepartmentMapperImpl implements DepartmentMapper {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department map(DepartmentRequest employeeRequest, Long id) {

		Department department = departmentRepository.findById(id);

		if (employeeRequest.getName() != null) {
			department.setName(employeeRequest.getName());
		}

		if (employeeRequest.getLocal() != null) {
			department.setLocal(employeeRequest.getLocal());
		}

		return department;
	}

}
