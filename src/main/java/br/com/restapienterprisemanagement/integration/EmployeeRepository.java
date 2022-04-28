package br.com.restapienterprisemanagement.integration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.restapienterprisemanagement.dto.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	Employee findById(Long id);
}
