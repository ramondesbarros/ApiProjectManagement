package br.com.apiprojectmanagement.integration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.apiprojectmanagement.dto.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

	Department findById(Long id);
}
