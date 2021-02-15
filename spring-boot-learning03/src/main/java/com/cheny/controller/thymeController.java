package com.cheny.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class thymeController {
    @RequestMapping("/th")
    public String index(Model model){
        model.addAttribute("name","nanem");
        return "/thymeleaf/index";
    }

}
