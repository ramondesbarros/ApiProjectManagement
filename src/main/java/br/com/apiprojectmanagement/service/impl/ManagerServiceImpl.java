package br.com.apiprojectmanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apiprojectmanagement.dto.Manager;
import br.com.apiprojectmanagement.dto.ManagerRequest;
import br.com.apiprojectmanagement.integration.ManagerRepository;
import br.com.apiprojectmanagement.map.ManagerMapper;
import br.com.apiprojectmanagement.service.ManagerService;

@Service
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	private ManagerRepository managerRepository;

	@Autowired
	private ManagerMapper managerMapper;

	@Override
	public void create(Manager manager) {

		managerRepository.save(manager);
	}

	@Override
	public Manager read(Long id) {

		return managerRepository.findById(id);
	}

	@Override
	public void updatePut(Manager manager, Long id) {
		// TODO Auto-generated method stub
	}

	@Override
	public void updatePath(ManagerRequest managerRequest, Long id) {

		managerRepository.save(managerMapper.map(managerRequest, id));
	}

	@Override
	public void delete(Manager manager) {
		
		managerRepository.delete(manager);
	}

	@Override
	public List<Manager> readAll() {
		
		return managerRepository.findAll();
	}
}
