package br.com.apiprojectmanagement.service;

import java.util.List;
import java.util.Optional;

import br.com.apiprojectmanagement.dto.Manager;

public interface ManagerService {

	void create(Manager manager);

	Optional<Manager> read(Long id);

	void updatePut(Manager manager, Long id);

	void updatePath(Manager manager, Long id);

	void delete(Manager manager);

	List<Manager> readAll();

}
