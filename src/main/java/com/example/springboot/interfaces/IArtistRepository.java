package com.example.springboot.interfaces;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.springboot.db.entities.Artist;

public interface IArtistRepository extends MongoRepository<Artist, String> {

}
