package com.example.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.models.GroceryList;

public interface GroceryListRepo extends CrudRepository<GroceryList,Integer>{}
