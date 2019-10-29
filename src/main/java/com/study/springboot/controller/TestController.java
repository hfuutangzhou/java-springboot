package com.study.springboot.controller;

import com.study.springboot.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private Student student;

    @GetMapping (value = "/test")
    public String test(){
        return student.getName()+":"+student.getAge()+":"+student.getScore();
    }

    @GetMapping(value = "/get")
    public String get(){
        return "success";
    }



}
