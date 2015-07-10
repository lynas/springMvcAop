package com.lynas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by LynAs on 7/10/2015.
 */

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "mainpage";
    }

    @RequestMapping("/p")
    public String p(){
        return "mainpage";
    }
}
