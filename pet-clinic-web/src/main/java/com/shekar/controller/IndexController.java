package com.shekar.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/greeting")
    public String getIndex() {
        return "greeting";
    }
}
