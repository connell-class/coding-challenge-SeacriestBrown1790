package com.example.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.models.ItemType;

public interface TypeRepo extends CrudRepository<ItemType,Integer>{}
