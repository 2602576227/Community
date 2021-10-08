package com.xbg.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
* @className : HelloController
* @description :
* @author : Administrator
* @date: 2021/10/8 16:54
*/
@Controller
public class IndexController {
    /*@GetMapping("/index")
    public String hello(@RequestParam(name = "name") String name, Model model){
        model.addAttribute("name",name);
        return "index";
    }*/
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
