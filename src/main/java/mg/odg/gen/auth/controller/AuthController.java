package mg.odg.gen.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthController{
	
	@GetMapping("/login")
	public ModelAndView login() {
		return new ModelAndView("auth/login");
	}
	
	@PostMapping("/login")
	public ModelAndView loging() {
		return new ModelAndView("auth/login");
	}
	

}
