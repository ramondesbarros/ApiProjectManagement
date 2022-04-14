package br.com.apiprojectmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * 
 * API é um conjunto de definições e protocolos usado no desenvolvimento e na integração de 
 * software de aplicações. API é um acrônimo em inglês que significa interface de programação 
 * e aplicações.
 * */

/**
 * 
 * Uma API permite que sua solução ou serviço se comunique com outros produtos e
 * serviços sem precisar saber como eles foram implementados. Isso simplifica o
 * desenvolvimento de aplicações, gerando economia de tempo e dinheiro. Ao
 * desenvolver novas ferramentas e soluções (ou ao gerenciar aquelas já
 * existentes), as APIs oferecem a flexibilidade necessária para simplificar o
 * design, a administração e o uso, além de fornecer oportunidades de inovação.
 */

@SpringBootApplication(scanBasePackages = "br.com.apiprojectmanagement")
@EntityScan(basePackages = "br.com.apiprojectmanagement.dto")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/**
	 * O framework Spring, é um dos frameworks Java mais conhecido e utilizado. Esse
	 * framework implementa um grande número de funções, como injeção de
	 * dependência, persistência de dados e uma implementação para o padrão MVC para
	 * a criação de aplicações WEB. O framework Spring começou a ser desenvolvido em
	 * 2002 e foi lançado em dezembro de 2013.
	 * 
	 */
	
	/**
	 * Injeção de dependência
	 * Quando aplicamos o conceito de inversão de controle, estamos na realidade transferindo 
	 * a responsabilidade de verificar a ocorrência de eventos no sistema para um sistema 
	 * maior,
	 * */
	
	/**
	 * Uma descrição melhor seria portanto a de que é um framework baseado no conceito de 
	 * injeção de dependências, que é uma especialização da inversão de controle. Pronto: 
	 * agora temos uma descrição mais interessante. Na injeção de dependências, não é a 
	 * classe cliente a responsável por definir quais serão suas dependências. Esta 
	 * responsabilidade é delegada a um container de injeção de dependências.

	 * */
	
	//https://spring.io/guides/gs/validating-form-input/
}
