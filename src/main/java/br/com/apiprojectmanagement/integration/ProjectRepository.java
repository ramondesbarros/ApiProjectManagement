package br.com.apiprojectmanagement.integration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.apiprojectmanagement.dto.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

	public Project findById(Long id);
}
