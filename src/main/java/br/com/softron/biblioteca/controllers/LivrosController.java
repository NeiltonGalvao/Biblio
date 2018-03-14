package br.com.softron.biblioteca.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.softron.biblioteca.daos.LivroDAO;
import br.com.softron.biblioteca.models.Livro;
import br.com.softron.biblioteca.models.TipoPreco;

@Controller
@RequestMapping("/livros")
public class LivrosController {

	@Autowired
	private LivroDAO livroDao;
	
	@RequestMapping("/form")
	public ModelAndView form(){
		ModelAndView modelAndView = new ModelAndView("livros/form");
		modelAndView.addObject("tipos", TipoPreco.values());
		return modelAndView;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView gravar(Livro livro, RedirectAttributes redirectAttributes){
		System.out.println(livro);
		livroDao.gravar(livro);
	    redirectAttributes.addFlashAttribute("sucesso","Livro cadastrado com sucesso!");
	    return new ModelAndView("redirect:livros");
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listar(){
	    List<Livro> livros = livroDao.listar();
	    ModelAndView modelAndView = new ModelAndView("/livros/lista");
	    modelAndView.addObject("livros", livros);
	    return modelAndView;
	}	
}