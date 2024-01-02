package com.example.springboot.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.GeneratedValue;


@Node("Artist")
public class Artist {
  @Id 
  @GeneratedValue
  private Integer artistID;

  public Artist() {};
}
