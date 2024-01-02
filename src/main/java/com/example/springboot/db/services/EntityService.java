package com.example.springboot.db.services;

import org.springframework.stereotype.Service;

import com.example.springboot.interfaces.IEntityRepository;

@Service
public class EntityService<T, E> {

    private final IEntityRepository<T, E> repository;

    public EntityService(IEntityRepository<T, E> _repository) {
        repository = _repository;
    }

    public void addEntity(T entity) {
        repository.save(entity);
    }
}
