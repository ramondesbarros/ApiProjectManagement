package br.com.apiprojectmanagement.map.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.apiprojectmanagement.dto.Project;
import br.com.apiprojectmanagement.dto.ProjectRequest;
import br.com.apiprojectmanagement.integration.ProjectRepository;
import br.com.apiprojectmanagement.map.ProjectMapper;

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
