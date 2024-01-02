package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;

import com.example.springboot.db.entities.Artist;
import com.example.springboot.db.services.ArtistService;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		Artist artist = new Artist("Сальвадор", "Дали");
	}
}
