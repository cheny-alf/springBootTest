package com.cheny.controller;

import com.cheny.bean.Guest;
import com.cheny.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * 业务控制类
 * 返回视图
 */
@Controller
public class GuestController {

    @Autowired
    private GuestService guestService;

    private String path = "";

    @GetMapping("")
    public String list(Model model){
        List<Guest> guests = guestService.list();
        model.addAttribute("guestList",guests);
        return path+"/list";
    }

}
