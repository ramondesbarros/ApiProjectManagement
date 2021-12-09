package br.com.apiprojectmanagement.map.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.apiprojectmanagement.dto.Manager;
import br.com.apiprojectmanagement.dto.ManagerRequest;
import br.com.apiprojectmanagement.integration.ManagerRepository;
import br.com.apiprojectmanagement.map.ManagerMapper;

@Component
public class ManagerMapperImpl implements ManagerMapper {

	@Autowired
	private ManagerRepository managerRepository;
	
	public Manager map(ManagerRequest managerRequest, Long id) {
				
		Manager manager = managerRepository.findById(id);
		
		if (managerRequest.getName() != null) {
			manager.setName(managerRequest.getName());
		}
		
		if (managerRequest.getEmail() != null) {
			manager.setEmail(managerRequest.getEmail());
		}
		
		if (managerRequest.getPhone() != null) {
			manager.setPhone(managerRequest.getPhone());
		}
		
		return manager;
	}

}
