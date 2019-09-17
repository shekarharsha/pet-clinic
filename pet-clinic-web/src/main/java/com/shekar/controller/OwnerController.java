package com.shekar.controller;


import com.shekar.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }


    @RequestMapping({"", "/", "/index.html"})
    public String getIndex(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owner/index";
    }
}
