package br.com.restapienterprisemanagement.map;

import br.com.restapienterprisemanagement.dto.Project;
import br.com.restapienterprisemanagement.dto.ProjectRequest;

public interface ProjectMapper {

	public Project map(ProjectRequest managerRequest, Long id);

}
