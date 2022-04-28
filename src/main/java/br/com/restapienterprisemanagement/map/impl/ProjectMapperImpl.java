package br.com.restapienterprisemanagement.map.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.restapienterprisemanagement.dto.Project;
import br.com.restapienterprisemanagement.dto.ProjectRequest;
import br.com.restapienterprisemanagement.integration.ProjectRepository;
import br.com.restapienterprisemanagement.map.ProjectMapper;


@Component
public class ProjectMapperImpl implements ProjectMapper {

	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public Project map(ProjectRequest managerRequest, Long id) {

		Project project = projectRepository.findById(id);

		if (managerRequest.getName() != null) {

			project.setName(managerRequest.getName());
		}

		if (managerRequest.getType() != null) {

			project.setType(managerRequest.getType());
		}

		return project;
	}

}
