package com.exam.examproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExamController {

    @RequestMapping("/hello")
    public String hello() {
        return "/hello.html";
    }
}
