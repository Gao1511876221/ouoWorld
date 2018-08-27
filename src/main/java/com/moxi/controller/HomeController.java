package com.moxi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home/")
public class HomeController {

    @RequestMapping("index")
    public String index(){
        return "index";
    }

}
