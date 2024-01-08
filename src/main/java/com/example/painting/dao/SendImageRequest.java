package com.example.painting.dao;

import lombok.Data;

@Data // Используйте Lombok для генерации геттеров и сеттеров
public class SendImageRequest {
    private long userID;
    private String imageURL;
}
