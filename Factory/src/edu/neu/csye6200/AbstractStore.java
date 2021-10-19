package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

import edu.neu.csye6200.item.Item;

public abstract class AbstractStore {
	private List<Item> items;
	
	AbstractStore(){
		setItems(new ArrayList<Item>());
	}
	
	abstract void createObjects() ;

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	protected void print() {
		for(Item item :items) {
			System.out.println(item);
		}
	}
	
}
