package com.GroceryStore.Model.Samples;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class SampleGroceryStoreitems {
	private Map <String, List<String>> sampleGroceryStoreitemList ;  
	
	
	
	public Map<String, List<String>> sampleGroceryStoreitemList() {
		sampleGroceryStoreitemList = new LinkedHashMap<String, List<String>>() ;
		
		this.putSampleGroceryCategory();
		this.putSampleGroceryItems();
		
		
		return sampleGroceryStoreitemList;
	}



	private void putSampleGroceryItems() {
		
		this.sampleGroceryStoreitemList.get("Dairy").add("Milk");
		this.sampleGroceryStoreitemList.get("Dairy").add("Curd");
		this.sampleGroceryStoreitemList.get("Dairy").add("Cheese");
		this.sampleGroceryStoreitemList.get("Dairy").add("Butter");
		
		this.sampleGroceryStoreitemList.get("Snacks").add("Cookies");
		this.sampleGroceryStoreitemList.get("Snacks").add("Cakes");
		this.sampleGroceryStoreitemList.get("Snacks").add("Chips");
		this.sampleGroceryStoreitemList.get("Snacks").add("Crackers");
		
		this.sampleGroceryStoreitemList.get("Vegtables").add("Tomato");
		this.sampleGroceryStoreitemList.get("Vegtables").add("Carrot");
		this.sampleGroceryStoreitemList.get("Vegtables").add("Bean");
		this.sampleGroceryStoreitemList.get("Vegtables").add("Potatoes");
		
		this.sampleGroceryStoreitemList.get("Fruits").add("Apples");
		this.sampleGroceryStoreitemList.get("Fruits").add("Mangoes");
		this.sampleGroceryStoreitemList.get("Fruits").add("Bananas");
		this.sampleGroceryStoreitemList.get("Fruits").add("Jack Fruits");
		
		this.sampleGroceryStoreitemList.get("Juice").add("Apple Juice");
		this.sampleGroceryStoreitemList.get("Juice").add("Beet Juice");
		this.sampleGroceryStoreitemList.get("Juice").add("Blueberry Juice");
		this.sampleGroceryStoreitemList.get("Juice").add("Grape Juice");
		
		
	}



	private void putSampleGroceryCategory() {
		
		this.sampleGroceryStoreitemList.put("Dairy", new ArrayList<String>());
		this.sampleGroceryStoreitemList.put("Snacks", new ArrayList<String>());
		this.sampleGroceryStoreitemList.put("Vegtables", new ArrayList<String>());
		this.sampleGroceryStoreitemList.put("Fruits", new ArrayList<String>());
		this.sampleGroceryStoreitemList.put("Juice", new ArrayList<String>());
		
	}

}
