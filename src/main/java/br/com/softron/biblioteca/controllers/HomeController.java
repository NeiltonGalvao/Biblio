package br.com.softron.biblioteca.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController{

	@RequestMapping("/")
	public String index(){
		System.out.println("Entrando na home Controle de eBooks");
		return "home";  //nao é necessário ".jsp" pois já está configurado em AppWebConfiguration
	}
}