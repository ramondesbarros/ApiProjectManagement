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

/**
 * O que é HATEOAS? Hypermedia as the Engine of Application State, ou HATEOAS, é
 * uma “maneira” de implementar APIs REST utilizando hipermídia para indicar que
 * ações ou navegações estão disponíveis para um determinado recurso.
 * 
 * As ações e a navegação são derivadas do estado do recurso e, eventualmente,
 * da própria API. Elas são disponibilizadas para o cliente através de uma
 * coleção de links.
 */

@RestController
@RequestMapping("/manager")
public class ManagerController {

	@Autowired
	private ManagerService managerService;

	@PostMapping
	void create(@RequestBody Manager manager) {

		managerService.create(manager);
	}

	/**
	 * Em resumo, o @PathVariable é utilizado quando o valor da variável é passada
	 * diretamente na URL, mas não como um parametro que você passa após o sinal de
	 * interrogação (?) mas sim quando o valor faz parte da url.
	 */
	@GetMapping("/{id}")
	Manager read(@PathVariable Long id) {

		return managerService.read(id);
	}

	/**
	 * Por outro lado, podemos ter vários parametros passados por url mas que não
	 * são parte da url em sí /contato?nome=Wolmir&email=wolm O parâmetro nome e
	 * email não são parte integrante da URL, por este motivo devem ser capturadas
	 * no controller utilizando @RequestParam, indiferente do método (POST ou GET).
	 */

	// --------------------------------------------------------------------------------------
	@GetMapping
	List<Manager> readAll() {

		return managerService.readAll();
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

}
