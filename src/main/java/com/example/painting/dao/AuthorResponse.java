package com.example.painting.dao;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AuthorResponse {
    @JsonProperty("authorID")
    private String authorID;

    @JsonProperty("name")
    private String name;

    @JsonProperty("surname")
    private String surname;

    public String getFullName() {
        return name + " " + surname;
    }
}
