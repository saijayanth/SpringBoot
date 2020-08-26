package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;

@Controller
public class AlienController {

	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return  "home.jsp";
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid) {
		Optional<Alien> alien = repo.findById(aid);
		
		System.out.println(repo.findByTech("c"));
		System.out.println(repo.findByAidGreaterThan(102));
		System.out.println(repo.findByTechSorted("c"));
		ModelAndView mv = new ModelAndView("showAlien.jsp");
		mv.addObject(alien.get());
		return  mv;
	}
	
	@RequestMapping("/updateAlien")
	public ModelAndView updateAlien(Alien alien) {
		repo.save(alien);
		
		ModelAndView mv = new ModelAndView("showAlien.jsp");
		return  mv;
	}
	
	@RequestMapping("/deleteAlien")
	public ModelAndView deleteAlien(@RequestParam int aid) {
		repo.deleteById(aid);
		
		ModelAndView mv = new ModelAndView("showAlien.jsp");
		return  mv;
	}
	
}
