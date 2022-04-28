package br.com.restapienterprisemanagement.map.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.restapienterprisemanagement.dto.Department;
import br.com.restapienterprisemanagement.dto.DepartmentRequest;
import br.com.restapienterprisemanagement.integration.DepartmentRepository;
import br.com.restapienterprisemanagement.map.DepartmentMapper;

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
