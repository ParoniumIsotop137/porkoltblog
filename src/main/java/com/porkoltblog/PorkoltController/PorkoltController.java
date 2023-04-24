package com.porkoltblog.PorkoltController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class PorkoltController {
	
	@RequestMapping("/porkoltblog")
	public String PorkoltBolog(Model model) {
		return "porkoltblog";
		
	}
	
}
