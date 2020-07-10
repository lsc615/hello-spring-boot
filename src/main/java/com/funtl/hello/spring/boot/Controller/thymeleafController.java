package com.funtl.hello.spring.boot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class thymeleafController {
    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("name", "张三");
        return "index";
    }
}
