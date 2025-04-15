package com.springbootdocker.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class DemoController {

    @GetMapping(path = {"/docker"})
    public String getResponse(){
        return "Hii this is spring docket demo project";
    }
}
