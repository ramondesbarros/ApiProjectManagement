package br.com.apiprojectmanagement.service;

import java.util.List;
import java.util.Optional;

import br.com.apiprojectmanagement.dto.Manager;
import br.com.apiprojectmanagement.dto.ManagerRequest;

public interface ManagerService {

	void create(Manager manager);

	Manager read(Long id);

	void updatePut(Manager managerRequest, Long id);

	void updatePath(ManagerRequest managerRequest, Long id);

	void delete(Manager manager);

	List<Manager> readAll();

}
