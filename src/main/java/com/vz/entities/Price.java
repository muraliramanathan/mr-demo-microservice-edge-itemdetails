package com.vz.entities;

public class Price {
	
	private double onlinePrice;
	
	private double storePrice;
	
	private double offerPrice;
	
	public Price(){
		
	}
	
	public Price(double onlinePrice, double storePrice, double offerPrice){
		this.onlinePrice = onlinePrice;
		this.storePrice = storePrice;
		this.offerPrice = offerPrice;
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
