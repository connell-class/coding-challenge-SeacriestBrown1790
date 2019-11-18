package com.example.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="grocery_items")
public class GroceryItem {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="item_id")
	private int item_id;
	
	@Column(name="item_name")
	private String name;
	
	@Column(name="item_type")
	private int type;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="list")
	@JsonIgnore
	private GroceryList gl;

	public GroceryItem(int item_id, String name, int type) {
		super();
		this.item_id = item_id;
		this.name = name;
		this.type = type;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + item_id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + type;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroceryItem other = (GroceryItem) obj;
		if (item_id != other.item_id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GroceryItem [item_id=" + item_id + ", name=" + name + ", type=" + type + "]";
	}

	public GroceryItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
}
