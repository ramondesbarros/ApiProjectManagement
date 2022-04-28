package br.com.restapienterprisemanagement.map;

import br.com.restapienterprisemanagement.dto.Manager;
import br.com.restapienterprisemanagement.dto.ManagerRequest;

public interface ManagerMapper {
	
	public Manager map(ManagerRequest managerRequest, Long id);

}
