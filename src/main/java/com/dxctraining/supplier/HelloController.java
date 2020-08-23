package com.dxctraining.supplier;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@GetMapping("/helo")
	public ModelAndView helloworld() {
		System.out.println("hello frds print statement");
		String msg="hello printing jsp statement";
		ModelAndView mv=new ModelAndView("hello","message",msg);
		return mv;
	}

}
