package com.shelpablo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    public HomeController() {
        System.out.println("HomeController created");
    }

    @RequestMapping(value = "/")
	public String index() {
		return "index";
	}

}
