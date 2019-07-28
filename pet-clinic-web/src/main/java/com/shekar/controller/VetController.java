package com.shekar.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index.html"})
    public String getIndex() {
        return "vet/index";
    }
}
