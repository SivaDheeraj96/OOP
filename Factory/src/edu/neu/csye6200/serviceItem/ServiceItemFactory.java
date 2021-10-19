package edu.neu.csye6200.serviceItem;

import java.util.Map;

import edu.neu.csye6200.item.Item;
import edu.neu.csye6200.item.Factory;

public class ServiceItemFactory implements Factory{
	private static Map<String, ServiceItem> serviceItems;
	static {
		serviceItems = ServiceItem.getServiceItems();
	}
	@Override
	public Item getItem(String type) {
		return serviceItems.get(type);
	}
	

}
