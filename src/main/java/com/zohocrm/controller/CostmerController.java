package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.zohocrm.enities.Costmer;
import com.zohocrm.service.CostmerService;

@Controller
public class CostmerController {
	
	@Autowired
	private CostmerService costmerServ;
	
	@GetMapping("/viewCretaeCostmer")
	public String viewCretaeCostmer() {
		return "create_costmer";
	}
	
	@PostMapping("/saveCostmer")
	public String saveOneCostmer(@ModelAttribute("costmer") Costmer cost, ModelMap model) {
		costmerServ.saveOneCostmer(cost);
		model.addAttribute("cost", cost);
		return "costmer_info";
	}
}
