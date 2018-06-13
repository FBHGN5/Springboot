package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
//    @Value("${size}")
//    private String size;
//    @Value("${age}")
//    private int age;
    @Autowired
    private Girl girl;
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        return "index";
    }
}
