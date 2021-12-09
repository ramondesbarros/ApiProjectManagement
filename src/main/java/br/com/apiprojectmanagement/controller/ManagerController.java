package br.com.apiprojectmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apiprojectmanagement.dto.Manager;
import br.com.apiprojectmanagement.dto.ManagerRequest;
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

	@GetMapping("/{id}")
	Manager read(@PathVariable Long id) {
		
		return managerService.read(id);
	}

	@PutMapping("/{id}")
	void updatePut(@RequestBody Manager manager, @PathVariable Long id) {
		
		managerService.updatePut(manager, id);
	}

	@PatchMapping("/{id}")
	void updatePath(@RequestBody ManagerRequest managerRequest, @PathVariable Long id) {
		
		managerService.updatePath(managerRequest, id);
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
