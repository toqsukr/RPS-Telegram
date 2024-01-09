package com.example.painting.dao;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class SendImageResponse {

    @JsonProperty("userID")
    private long userID;

    @JsonProperty("imageData")
    private ImageResponse imageData;
}
