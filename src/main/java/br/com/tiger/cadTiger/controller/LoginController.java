package br.com.tiger.cadTiger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String loginPage(){
    	System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXX");
    	return "login";
    }

}
