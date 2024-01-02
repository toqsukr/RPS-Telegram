package com.example.springboot.interfaces;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface IEntityRepository<T, E> extends MongoRepository<T, E> {

}
