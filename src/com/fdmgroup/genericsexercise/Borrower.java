package com.fdmgroup.genericsexercise;

public class Borrower<T extends Number> implements CatalogItem<T> {

	private T id;
	@Override
	public T getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void setId(T id) {
		this.id = id;
		
	}

}
