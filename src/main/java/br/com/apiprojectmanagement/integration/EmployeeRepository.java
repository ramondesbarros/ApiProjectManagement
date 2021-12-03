package br.com.apiprojectmanagement.integration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.apiprojectmanagement.dto.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
