package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class RequestMappingController {

    @RequestMapping("/testFirst")
    public String testFirst(){
        return "success";
    }
}
