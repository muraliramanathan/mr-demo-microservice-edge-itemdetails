package com.vz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vz.entities.Item;
import com.vz.entities.ItemDetails;
import com.vz.entities.Price;
import com.vz.feign.MicroServiceClientA;
import com.vz.feign.MicroServiceClientB;
import com.vz.rx.CustomObservable;
import com.vz.tranformer.ItemDataTransformer;

import rx.Observable;

@Service
public class ItemDetailsServiceImpl implements ItemService {
	
	private final CustomObservable	customObservable;
	
	private final MicroServiceClientA microServiceClientA;
	
	private final MicroServiceClientB microServiceClientB;
	
	
	@Autowired
	public ItemDetailsServiceImpl(CustomObservable customObservable,MicroServiceClientA a,MicroServiceClientB b){
		this.customObservable = customObservable;
		this.microServiceClientA  = a;
		this.microServiceClientB = b;
	}

	@Override
	public ItemDetails getItemDetails() {
		// TODO Auto-generated method stub
		
		Observable<Item> microAObservable 
					= customObservable.getObservable(()-> microServiceClientA.getItemMetadata());
		
		Observable<Price> microBObservable 
		= customObservable.getObservable(()-> microServiceClientB.getItemPrice());
		
		System.out.println(microServiceClientA.getItemMetadata());
		
		System.out.println(microServiceClientB.getItemPrice());		
		
		return Observable.zip(microAObservable, microBObservable, new ItemDataTransformer()).toBlocking().single();
				
    }
}
