package com.fdmgroup.genericsexercise;

public class Book<T extends Number> implements CatalogItem<T> {
	
	private T id;
	
	@Override
	public  T getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void setId(T id) {
		// TODO Auto-generated method stub
		this.id = id;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
