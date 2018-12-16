package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.example.Application;
import com.example.model.Item;
import com.example.repository.ItemRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)
public class ApplicationTests {

    @Autowired
    private ItemRepository itemRepository;
	
	@Test
	public void find() {
		List<Item> itemList=itemRepository.findByName("A");
		for (Item item : itemList) {
			System.out.println(item);
		}
	}
	
	@Test
	public void update() {
	       Item item123=new Item();
	       item123.setName("123");
	       Example<Item>example=Example.of(item123);
	       Optional<Item> itemoption = itemRepository.findOne(example);
	       Item item=itemoption.get();
	       item.setName("D");
	       itemRepository.save(item);
	}
	
	@Test
	public void insert() {
		   Item item123=new Item();
		   item123.setName("123");
		   item123.setNumber("456");
           itemRepository.insert(item123);
	}
	
	@Test
	public void findAll() {
		List<Item> itemList=itemRepository.findAll();
		for (Item item : itemList) {
			System.out.println(item);
		}
	}
	
}
