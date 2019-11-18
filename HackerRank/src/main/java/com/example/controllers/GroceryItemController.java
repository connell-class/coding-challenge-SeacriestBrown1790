package com.example.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.GroceryItem;
import com.example.repos.GroceryItemRepo;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(value="/items")
public class GroceryItemController {

	@Autowired
	private GroceryItemRepo gir;
	
	public GroceryItemRepo getRepository() {
		return gir;
	}
	
	@Autowired
	public void setRepository(GroceryItemRepo gir) {
		this.gir=gir;
	}
	
	@GetMapping(value="/item")
	public String save() {
		GroceryItem gi1 = new GroceryItem(0,"T-Shirt",3);
		gir.save(gi1);
		GroceryItem gi2 = new GroceryItem(0,"Apples",1);
		gir.save(gi2);
		GroceryItem gi3 = new GroceryItem(0,"Phone Charger",2);
		gir.save(gi3);
		GroceryItem gi4 = new GroceryItem(0,"Pizza",1);
		gir.save(gi4);
		GroceryItem gi5 = new GroceryItem(0,"Jacket",3);
		gir.save(gi5);
		GroceryItem gi6 = new GroceryItem(0,"White Rice",1);
		gir.save(gi6);
		GroceryItem gi7 = new GroceryItem(0,"Cereal",1);
		gir.save(gi7);
		GroceryItem gi8 = new GroceryItem(0,"Canned Beans",1);
		gir.save(gi8);
		GroceryItem gi9 = new GroceryItem(0,"Pants",3);
		gir.save(gi9);
		GroceryItem gi10 = new GroceryItem(0,"Extenison Cord",2);
		gir.save(gi10);
		return "Check Database ...nerd";
	}
	
	@GetMapping(value="/allitems")
	public List<GroceryItem> getAll(){
		List<GroceryItem> list = new ArrayList<>();
		for(GroceryItem gi : gir.findAll())
			list.add(gi);
		return list;
	}
}
