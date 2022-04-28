package br.com.restapienterprisemanagement.integration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.restapienterprisemanagement.dto.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

	Department findById(Long id);
}
