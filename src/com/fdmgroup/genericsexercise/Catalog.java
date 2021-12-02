package com.fdmgroup.genericsexercise;

import java.util.ArrayList;
import java.util.List;

public class Catalog<T extends CatalogItem<? extends Number>>  {
	
	List<T> catalogItems = new ArrayList<>();

	//Getter
	public List<T> getCatalogItems() {
		return catalogItems;
	}
	//Setter
	public void setCatalogItems(List<T> catalogItems) {
		this.catalogItems = catalogItems;
	}
	
	//Methods
	public void addItem(T t) {
		catalogItems.add(t);
	}
		
	
	

}
