package br.com.apiprojectmanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.apiprojectmanagement.dto.Manager;
import br.com.apiprojectmanagement.service.ManagerService;

@RestController
@RequestMapping("/manager")
public class ManagerController {

	@Autowired
	private ManagerService managerService;

	@PostMapping
	void create(@RequestBody Manager manager) {

		managerService.create(manager);
	}

	Optional<Manager> read(Long id) {
		return managerService.read(id);
	}

	@PutMapping
	void updatePut(@RequestBody Manager manager, Long id) {
		managerService.updatePut(manager, id);
	}

	@PatchMapping
	void updatePath(Manager manager, Long id) {

	}

	@DeleteMapping
	void delete(Manager manager) {
		managerService.delete(manager);
	}

	@GetMapping
	List<Manager> readAll() {

		return managerService.readAll();
	}

}
