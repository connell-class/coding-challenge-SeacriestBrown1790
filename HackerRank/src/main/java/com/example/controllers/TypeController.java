package com.example.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.ItemType;
import com.example.repos.TypeRepo;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(value="/types")
public class TypeController {
	
	@Autowired
	private TypeRepo tr;
	
	public TypeRepo getRepository() {
		return tr;
	}
	
	@Autowired
	public void setRepository(TypeRepo tr) {
		this.tr=tr;
	}
	
	@GetMapping(value="/type")
	public String save() {
		ItemType it1 = new ItemType(0,"Food");
		tr.save(it1);
		ItemType it2 = new ItemType(0,"Electronics");
		tr.save(it2);
		ItemType it3 = new ItemType(0,"Clothing");
		tr.save(it3);
		return "Don't Check database";
	}
	
	@GetMapping(value="/all")
	public List<ItemType> getAll(){
		List<ItemType> list  = new ArrayList<>();
		for (ItemType it : tr.findAll())
			list.add(it);
		return list;
	}
	@GetMapping(value="/error")
	public String error() {
		return "Not here";
	}

}
