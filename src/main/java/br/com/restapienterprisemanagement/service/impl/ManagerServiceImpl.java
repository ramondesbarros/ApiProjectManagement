package br.com.restapienterprisemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.restapienterprisemanagement.dto.Manager;
import br.com.restapienterprisemanagement.dto.ManagerRequest;
import br.com.restapienterprisemanagement.integration.ManagerRepository;
import br.com.restapienterprisemanagement.map.ManagerMapper;
import br.com.restapienterprisemanagement.service.ManagerService;


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
