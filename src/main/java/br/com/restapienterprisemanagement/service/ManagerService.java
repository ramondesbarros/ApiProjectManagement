package br.com.restapienterprisemanagement.service;

import java.util.List;

import br.com.restapienterprisemanagement.dto.Manager;
import br.com.restapienterprisemanagement.dto.ManagerRequest;

public interface ManagerService {

	void create(Manager manager);

	Manager read(Long id);

	void updatePut(Manager managerRequest, Long id);

	void updatePath(ManagerRequest managerRequest, Long id);

	void delete(Manager manager);

	List<Manager> readAll();

}
