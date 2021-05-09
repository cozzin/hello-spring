package com.cozzin.example.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "spring!!"); // key value로 넣어줌
        return "hello"; // 렌더링 할 파일명. resources/templates/hello.html. viewResolver가 화면을 찾아서 처리한다.
    }
}
