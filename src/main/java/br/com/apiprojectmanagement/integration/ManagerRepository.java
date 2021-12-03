package br.com.apiprojectmanagement.integration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.apiprojectmanagement.dto.Manager;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Integer> {

//	@Query("SELECT m FROM manager m WHERE m.id = :id")
//	Manager findManagerById(@Param("id") Long id);
	
}
