package com.fdmgroup.genericsexercise;

public class Runner {

	public static void main(String[] args) {
		
		Book<Integer> b = new Book<>();
		b.setId(1);
		
		Catalog<CatalogItem<Integer>> cat = new Catalog<>();

		cat.addItem(b);
		
		
		
	}

}
