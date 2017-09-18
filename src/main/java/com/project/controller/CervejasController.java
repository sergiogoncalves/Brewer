package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.dataobject.BeerDO;

@Controller
public class CervejasController {
	
	@RequestMapping("/beer/new")
	public String addBeer() {
		return "beer/ManageBeer";
	}
	
	@RequestMapping(value = "/beer/new", method = RequestMethod.POST)
	public String add(BeerDO beerDO) {
		System.out.println(">>>>> Add!");
		System.out.println(beerDO.getSku());
		
		return "beer/ManageBeer";
	}

}
