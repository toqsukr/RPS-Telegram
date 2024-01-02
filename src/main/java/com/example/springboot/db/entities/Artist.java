package com.example.springboot.db.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "artist")
public class Artist {
  @Id
  private String artistID;
  private String name;
  private String surname;

  public Artist(String _name, String _surname) {
    name = _name;
    surname = _surname;
  };

  public String getAritstID() {
    return artistID;
  }

  public String getName() {
    return name;
  }

  public void setName(String _name) {
    name = _name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String _surname) {
    surname = _surname;
  }
}