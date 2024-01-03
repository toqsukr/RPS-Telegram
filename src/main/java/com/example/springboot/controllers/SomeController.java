package com.example.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.db.entities.Artist;
import com.example.springboot.db.services.ArtistService;

@RestController
@RequestMapping("/")
public class SomeController {
    private final ArtistService artistService;

    @Autowired
    public SomeController(ArtistService _artistService) {
        artistService = _artistService;
    }

    @RequestMapping("/example")
    public String handleRequest() {
        Artist artist = new Artist("Сальвадор", "Дали");
        artistService.addEntity(artist);
        return "example-page";
    }
}
