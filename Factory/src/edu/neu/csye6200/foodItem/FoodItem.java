package edu.neu.csye6200.foodItem;

import java.util.HashMap;
import java.util.Map;
import edu.neu.csye6200.item.Item;

public class FoodItem extends Item{
	private Map<String, FoodItem> foodItems = new HashMap<>();

	FoodItem(String data)
	{
		String[] vals = data.split(",");
		this.name = vals[1];
		try {
			this.id = Integer.parseInt(vals[0]);
		}
		catch (Exception e) {
			System.err.println("Error while parsing item code in Food item");
			e.printStackTrace();
		}
		try {
			this.price = Double.parseDouble(vals[2]);
		}
		catch (Exception e) {
			System.err.println("Error while parsing item price in Food item");
			e.printStackTrace();
		}
		foodItems.put(this.name, this);
	}
	
	@Override
	public String toString() {
		return "This is FoodItem "+this.name+" ID: "+this.id+" price:"+ this.price;
	}
	
	
}
