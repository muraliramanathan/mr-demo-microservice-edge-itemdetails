package com.vz.tranformer;

import com.vz.entities.Item;
import com.vz.entities.ItemDetails;
import com.vz.entities.Price;

import rx.functions.Func2;

public class ItemDataTransformer implements Func2<Item, Price, ItemDetails> {

	@Override
	public ItemDetails call(Item item, Price price) {
		// TODO Auto-generated method stub
		ItemDetails itemDetails = new ItemDetails();
		itemDetails.setItemId(item.getItemId());
		itemDetails.setItemName(item.getItemName());
		itemDetails.setItemDescription(item.getItemDescription());
		itemDetails.setOnlinePrice(price.getOnlinePrice());
		itemDetails.setStorePrice(price.getOfferPrice());
		itemDetails.setOfferPrice(price.getOfferPrice());
		return itemDetails;
	}

}
