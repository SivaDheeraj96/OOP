package edu.neu.csye6200;

import edu.neu.csye6200.item.Item;
import edu.neu.csye6200.item.ItemFactory;

public class Store extends AbstractStore{

	void createObjects(){
		ItemFactory factory = new ItemFactory();
		this.getItems().add(factory.getFactory("FOOD").getItem("DOSA"));
		this.getItems().add(factory.getFactory("FOOD").getItem("IDLY"));
		this.getItems().add(factory.getFactory("ELECTRONIC").getItem("WATCH"));
		this.getItems().add(factory.getFactory("ELECTRONIC").getItem("LAPTOP"));
		this.getItems().add(factory.getFactory("SERVICE").getItem("ELECTRICITY"));
		this.getItems().add(factory.getFactory("SERVICE").getItem("WATER"));
	}
	public static void demo() {
		Store s = new Store();
		s.createObjects();
		System.out.println("list after creating objects ... ");
		s.print();
		s.getItems().sort(Item::sortByName);
		System.out.println("list after sorting by Name ... ");
		s.print();
		s.getItems().sort(Item::sortById);
		System.out.println("list after sorting by ID ... ");
		s.print();
		s.getItems().sort(Item::sortByPrice);
		System.out.println("list after sorting by Price ... ");
		s.print();
	}
	
}
