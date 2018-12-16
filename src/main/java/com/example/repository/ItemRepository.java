package com.example.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.Item;

public interface ItemRepository extends MongoRepository<Item, String>{
	List<Item>findByName(String name);

}
