package com.example.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.models.GroceryItem;

public interface GroceryItemRepo extends CrudRepository<GroceryItem,Integer> {}
