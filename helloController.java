package org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/helloworld") //Informar o endereço da Web
public class helloController {
	@GetMapping // pega informação do método e exibe
	public String hello() {
		return "Hello World! Seja, bem vindos ao Spring!";
	}	
		 @GetMapping ("/bsm")
		    public String bsm() {
		        return "Comunicação, Mentalidade de crescimento, Orientação ao detalhe, Orientação ao Futuro, Persistência, Proatividade, Responsabilidade Pessoal Trabalho em Equipe";
		 }
		        @GetMapping ("/objetivos")
			    public String objetivos() {
			        return "Realização de tarefas, persistência, foco e determinação.";
	}
}


/*
Model - Modelagem das tabelas no banco de dados 
Repository - Consultas no banco de dados 
Controller - Controlador de funções dentro da nossa aplicação
*/