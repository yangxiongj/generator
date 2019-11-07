package com.ruoyi.generator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping({"/","index"})
    public String gen()
    {
        return  "index";
    }
    @GetMapping("main")
    public String main()
    {
        return  "main_v1";
    }

}
