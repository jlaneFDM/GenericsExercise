package com.fdmgroup.genericsexercise;

public interface CatalogItem<T extends Number> {
	T getId();
	void setId(T id);

}
