package com.example.painting.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.painting.bot.ImageHandler;
import com.example.painting.dao.SendImageRequest;

@RestController
@RequestMapping("/")
@Controller
public class SomeController {

    private final ImageHandler imageHandler;

    @Autowired
    public SomeController(ImageHandler imageHandler) {
        this.imageHandler = imageHandler;
    }

    @PostMapping("/api/image")
    public ResponseEntity<String> handleSendImage(@RequestBody SendImageRequest request) {
        imageHandler.replyImage(request.getUserID(), request.getImageURL());
        return ResponseEntity.ok("The image was send successful!");
    }
}
