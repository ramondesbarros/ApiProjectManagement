package br.com.apiprojectmanagement.map;

import br.com.apiprojectmanagement.dto.Manager;
import br.com.apiprojectmanagement.dto.ManagerRequest;


public interface ManagerMapper {
	
	public Manager map(ManagerRequest managerRequest, Long id);

}
