package com.example.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springboot.db.entities.Artist;
import com.example.springboot.db.services.EntityService;

@Controller
public class SomeController {
    private final EntityService<Artist, String> artistService;

    @Autowired
    public SomeController(EntityService<Artist, String> _artistService) {
        artistService = _artistService;
    }

    @RequestMapping("/example")
    public String handleRequest() {
        Artist artist = new Artist("Сальвадор", "Дали");
        artistService.addEntity(artist);
        return "example-page";
    }
}
