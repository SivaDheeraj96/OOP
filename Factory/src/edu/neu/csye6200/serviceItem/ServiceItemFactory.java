package edu.neu.csye6200.serviceItem;

import java.util.Map;

import edu.neu.csye6200.item.Item;
import edu.neu.csye6200.item.Factory;

public class ServiceItemFactory implements Factory{
	private static Map<String, ServiceItem> serviceItems;
	private static Factory factory = new ServiceItemFactory();
	static {
		serviceItems = ServiceItem.getServiceItems();
	}
	private ServiceItemFactory() {
		
	}
	@Override
	public Item getItem(String type) {
		return serviceItems.get(type);
	}
	
	public static Factory getServiceItemFactory() {
		return factory; 
	}

}
