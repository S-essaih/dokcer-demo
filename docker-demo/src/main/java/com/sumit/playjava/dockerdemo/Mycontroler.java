package com.sumit.playjava.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroler {

    @GetMapping("/test-docker")
    public String getData(){
        return "in docker tutorial project of play java in docker";
    }
}
