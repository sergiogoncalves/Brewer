package com.project.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.project.dataobject.BeerDO;

@Controller
public class BeerController {
	
	@RequestMapping("/beer/new")
	public String addBeer() {
		return "beer/ManageBeer";
	}
	
	@RequestMapping(value = "/beer/new", method = RequestMethod.POST)
	public String add(@Valid BeerDO beerDO, BindingResult result, Model model, RedirectAttributes attributes) {
		
		if (result.hasErrors()) {
			
			model.addAttribute("mensagem", "Erro no formulário"); //Esse model não funciona para redirect
			
			return "beer/ManageBeer";
		}
		
		System.out.println(">>>>> Add!");
		System.out.println(beerDO.getSku());
		
		
		attributes.addFlashAttribute("mensagem", "Beer saved!"); //Funciona para redirect
		
		return "redirect:/beer/new";
	}

}
