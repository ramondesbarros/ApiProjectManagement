package br.com.apiprojectmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apiprojectmanagement.dto.Project;
import br.com.apiprojectmanagement.integration.ProjectRepository;
import br.com.apiprojectmanagement.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public void create(Project project) {
		projectRepository.save(project);

	}

	@Override
	public Optional<Project> read(Long id) {
		return projectRepository.findById(id.intValue());
	}

	@Override
	public void updatePut(Project project, Long id) {
		// TODO Auto-generated method stub
	}

	@Override
	public void updatePath(Project project, Long id) {
		// TODO Auto-generated method stub
		projectRepository.findById(id.intValue());
	}

	@Override
	public void delete(Project project) {
		projectRepository.delete(project);

	}

	@Override
	public List<Project> readAll() {
		return projectRepository.findAll();
	}

}
