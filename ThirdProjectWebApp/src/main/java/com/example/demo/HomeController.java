package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

	@RequestMapping("home")
	public ModelAndView home(Alien alien) {

//		System.out.println("home method in HomeController, hello "+ name1);
//		String name = req.getParameter("name");
//		req.setAttribute("name", name);
//		HttpSession session = req.getSession();
//		session.setAttribute("name", name1);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", alien);
		mv.setViewName("home");
		
	return mv;
	}
}
