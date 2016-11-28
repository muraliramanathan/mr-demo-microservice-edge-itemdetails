package com.vz.entities;

public class ItemDetails {
	
	private long itemId;	
	
	private String itemName;
	
	private String itemDescription;
		
	private double onlinePrice;
	
	private double storePrice;
	
	private double offerPrice;
	
	
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

	public double getOnlinePrice() {
		return onlinePrice;
	}

	public void setOnlinePrice(double onlinePrice) {
		this.onlinePrice = onlinePrice;
	}

	public double getStorePrice() {
		return storePrice;
	}

	public void setStorePrice(double storePrice) {
		this.storePrice = storePrice;
	}

	public double getOfferPrice() {
		return offerPrice;
	}

	public void setOfferPrice(double offerPrice) {
		this.offerPrice = offerPrice;
	}
	

}
