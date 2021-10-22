package edu.neu.csye6200.item;

import edu.neu.csye6200.electronicItem.ElectronicItemFactory;
import edu.neu.csye6200.foodItem.FoodItemFactory;
import edu.neu.csye6200.serviceItem.ServiceItemFactory;

public class ItemFactory {

	public Factory getFactory(String type) {
		switch(type) {
		case "SERVICE":
			return ServiceItemFactory.getServiceItemFactory();
		case "FOOD":
			return new FoodItemFactory();
		case "ELECTRONIC":
			return ElectronicItemFactory.getElectronicItemFactory();
		}
		return null;
	}
}
