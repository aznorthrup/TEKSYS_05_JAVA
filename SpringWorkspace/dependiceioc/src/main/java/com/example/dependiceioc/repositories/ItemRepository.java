package com.example.dependiceioc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.dependiceioc.entities.Item;

public interface ItemRepository extends CrudRepository<Item, Integer>{

	@Query("SELECT * FROM items WHERE item_id")
	List<Item> findItemById(int item_id);
	
}
