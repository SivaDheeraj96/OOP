package edu.neu.csye6200.electronicItem;

import java.util.Map;

import edu.neu.csye6200.item.Factory;
import edu.neu.csye6200.item.Item;

public class ElectronicItemFactory implements Factory{
	private static Map<String, ElectronicItem> items = null;
	
	
	@Override
	public Item getItem(String type) {
		if(items == null) {
			items = ElectronicItem.getItems();
		}
		return items.get(type);
	}

}
