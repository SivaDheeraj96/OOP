package edu.neu.csye6200.foodItem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.neu.csye6200.FileUtil;
import edu.neu.csye6200.item.Item;
import edu.neu.csye6200.item.Factory;

public class FoodItemFactory implements Factory{
	private Map<String,Item> foodItemsByName;
	public FoodItemFactory()
	{
		foodItemsByName = new HashMap<>();
		List<String> foodData = FileUtil.getParsedFileData("FoodItemCSV.txt");
		for(int i=0;i<foodData.size();i++) {
			Item item = new FoodItem(foodData.get(i));
			foodItemsByName.put(item.getName(), item);
		}		
	}
	@Override
	public Item getItem(String type) 
	{
		return foodItemsByName.get(type);
	}

}
