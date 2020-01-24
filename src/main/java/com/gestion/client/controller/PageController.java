package com.gestion.client.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/")
public class PageController {
	
	 @RequestMapping(value="index")
	 public String First(){
	

		 return "index";
	 }
}
