package sidali.SpringApps.FirstSpringBootApp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Salamou alaykoum";
		
	}

}
