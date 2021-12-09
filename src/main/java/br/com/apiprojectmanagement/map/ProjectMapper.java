package br.com.apiprojectmanagement.map;

import br.com.apiprojectmanagement.dto.Project;
import br.com.apiprojectmanagement.dto.ProjectRequest;

public interface ProjectMapper {

	public Project map(ProjectRequest managerRequest, Long id);

}
