package com.vz.entities;

public class Item {
	
	private long itemId;
	
	private String itemName;
	
	private String itemDescription;
	
	public Item(){
		
	}
	
	public Item(long id, String name, String description){
		this.itemId = id;
		this.itemName = name;
		this.itemDescription = description;
	}
	
	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	
	

}
