package com.vz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vz.entities.ItemDetails;
import com.vz.service.ItemService;

@RestController
public class ItemDetailsController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/itemdetails")
	public @ResponseBody ItemDetails getItemDetails(){	
		
		
		return itemService.getItemDetails();
		
	}

}
