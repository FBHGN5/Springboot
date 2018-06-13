package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GirlController {
    @Autowired
    private GirlDao girlDao;
    @GetMapping(value = "/girl")
    public List<Girl> girlList(){
     return girlDao.findAll();
    }
    @GetMapping(value = "/girl1")
    public String addGirl(@RequestParam("age")int age,@RequestParam("size") String size){
       Girl girl =new Girl();
       girl.setAge(age);
       girl.setSize(size);
       girlDao.save(girl);
       return girl.toString();
    }
    @GetMapping(value = "/girl2")
    public List<Girl> findGirl(@RequestParam("age")int age){
      return (List<Girl>) girlDao.findByAge(age);
    }
}
