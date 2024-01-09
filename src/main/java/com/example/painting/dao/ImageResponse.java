package com.example.painting.dao;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ImageResponse {
    @JsonProperty("id")
    private String id;

    @JsonProperty("title")
    private String title;

    @JsonProperty("src")
    private String src;

    @JsonProperty("author")
    private AuthorResponse author;

    @JsonProperty("description")
    private String description;
}
