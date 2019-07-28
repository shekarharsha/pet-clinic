package com.shekar.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owner")
public class OwnerController {

    @RequestMapping({"", "/", "/index.html"})
    public String getIndex() {
        return "owner/index";
    }
}
