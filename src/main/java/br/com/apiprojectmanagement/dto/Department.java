package br.com.apiprojectmanagement.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.apiprojectmanagement.enums.Local;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "department")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Size(min=2, max=30)
	private String name;

	private Local local;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "manager_id", referencedColumnName = "id")
	private Manager manager;

	/**
	 * 
	 * MappedBy: informamos o nome da variável de instância que vai indicar a quem
	 * aquele One pertence, ou seja, um jogador; e ele deve dizer a qual time este
	 * está associado; TargetEntity: informa qual a entidade estamos associando;
	 * FetchType.Lazy: foi escolhido por performace; cascade: ALL para permitir
	 * alterações em todos os relacionamentos.
	 */
	@JsonIgnore
	@OneToMany(mappedBy = "department", targetEntity = Employee.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Employee> employees;

	/**
	 * 
	 * MappedBy: informamos o nome da variável de instância que vai indicar a quem
	 * aquele One pertence, ou seja, um jogador; e ele deve dizer a qual time este
	 * está associado; TargetEntity: informa qual a entidade estamos associando;
	 * FetchType.Lazy: foi escolhido por performace; cascade: ALL para permitir
	 * alterações em todos os relacionamentos.
	 */
	@JsonIgnore
	@OneToMany(mappedBy = "department", targetEntity = Project.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Project> project;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}
}
