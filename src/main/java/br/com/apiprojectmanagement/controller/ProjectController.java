package br.com.apiprojectmanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.apiprojectmanagement.dto.Project;
import br.com.apiprojectmanagement.dto.ProjectRequest;
import br.com.apiprojectmanagement.service.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	@PostMapping
	void create(@RequestBody Project project) {
		projectService.create(project);
	}

	Optional<Project> read(Long id) {

		return projectService.read(id);
	}

	@PutMapping
	void updatePut(Project project, Long id) {

	}

	@PatchMapping
	void updatePath(@RequestBody ProjectRequest projectRequest, @RequestParam Long id) {

		projectService.updatePath(projectRequest, id);
	}

	@DeleteMapping
	void delete(Project project) {
		projectService.delete(project);
	}

	@GetMapping
	List<Project> readAll() {

		return projectService.readAll();
	}

}
