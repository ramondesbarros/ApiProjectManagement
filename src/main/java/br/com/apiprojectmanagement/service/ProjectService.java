package br.com.apiprojectmanagement.service;

import java.util.List;
import java.util.Optional;

import br.com.apiprojectmanagement.dto.Project;

public interface ProjectService {

	void create(Project project);

	Optional<Project> read(Long id);

	//Atualizar todos os dados
	void updatePut(Project project, Long id);

	//Atualizar alguns dados
	void updatePath(Project project, Long id);

	void delete(Project project);

	List<Project> readAll();

}
