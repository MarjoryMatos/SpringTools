package com.generation.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //indica que isso é uma classe controladora
@RequestMapping("/helloword") //isso indica oq será executado, onde colocamos o endpoints
public class HelloController {
	
	@GetMapping //quando batemos no end point temos que chamar o verbo, aqui utilizamos o get
	public String hello() {
		return "Eita mundo bom de acabar!";
	}

}
