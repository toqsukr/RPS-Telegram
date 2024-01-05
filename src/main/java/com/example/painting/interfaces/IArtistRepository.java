package com.example.painting.interfaces;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.painting.db.entities.Artist;

public interface IArtistRepository extends MongoRepository<Artist, String> {

}
