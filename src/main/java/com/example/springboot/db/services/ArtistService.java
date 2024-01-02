package com.example.springboot.db.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.db.entities.Artist;
import com.example.springboot.interfaces.IArtistRepository;

@Service
public class ArtistService {

    private final IArtistRepository repository;

    @Autowired
    public ArtistService(IArtistRepository _repository) {
        repository = _repository;
    };

    public void addEntity(Artist entity) {
        repository.save(entity);
    }
}
