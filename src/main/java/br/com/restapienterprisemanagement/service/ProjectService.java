package br.com.restapienterprisemanagement.service;

import java.util.List;
import java.util.Optional;

import br.com.restapienterprisemanagement.dto.Project;
import br.com.restapienterprisemanagement.dto.ProjectRequest;

public interface ProjectService {

	void create(Project project);

	Optional<Project> read(Long id);

	//Atualizar todos os dados
	void updatePut(Project project, Long id);

	//Atualizar alguns dados
	void updatePath(ProjectRequest projectRequest, Long id);

	void delete(Project project);

	List<Project> readAll();

}
