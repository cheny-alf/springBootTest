package com.cheny.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FTLController {
    @RequestMapping("/ftl")
    public String index(){
        return "index";
    }

}
