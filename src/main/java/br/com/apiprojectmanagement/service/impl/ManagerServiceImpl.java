package br.com.apiprojectmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apiprojectmanagement.dto.Manager;
import br.com.apiprojectmanagement.integration.ManagerRepository;
import br.com.apiprojectmanagement.service.ManagerService;

@Service
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	private ManagerRepository managerRepository;

	@Override
	public void create(Manager manager) {
		managerRepository.save(manager);
	}

	@Override
	public Optional<Manager> read(Long id) {
		return managerRepository.findById(id.intValue());
	}

	@Override
	public void updatePut(Manager manager, Long id) {
		// TODO Auto-generated method stub
		managerRepository.save(manager);

	}

	@Override
	public void updatePath(Manager manager, Long id) {
		// TODO Auto-generated method stub
		managerRepository.save(manager);
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
