package br.com.restapienterprisemanagement.integration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.restapienterprisemanagement.dto.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

	public Project findById(Long id);
}
