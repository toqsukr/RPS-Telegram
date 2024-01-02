package com.example.springboot.db.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import com.example.springboot.db.entities.Artist;

@Service
public class ArtistService {

    private final CrudRepository<Artist, String> repository;

    public ArtistService(CrudRepository<Artist, String> _repository) {
        repository = _repository;
    }

    public void addArtist(Artist entity) {
        repository.save(entity);
    }
}
