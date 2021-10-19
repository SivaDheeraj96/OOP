package edu.neu.csye6200.serviceItem;

import edu.neu.csye6200.FileUtil;
import edu.neu.csye6200.item.Item;
import java.util.*;

public class ServiceItem extends Item{
	
	private ServiceItem(String row) {
		String[] vals = row.split(",");
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
	}
	private static Map<String, ServiceItem> serviceItems =null;
	protected synchronized static Map<String, ServiceItem> getServiceItems(){
		if(serviceItems == null) {
				Map<String, ServiceItem> map= new HashMap<String, ServiceItem>();
				List<String> data = FileUtil.getParsedFileData("ServiceItemCSV.txt");
				for(String row :data) {
					ServiceItem item = new ServiceItem(row);
					map.put(item.getName(),item);
				}
				serviceItems = map;
		}
		return serviceItems;
	}
	
	public String toString() {
		return "This is ServiceItem "+this.name+" ID: "+this.id+" price:"+ this.price;
	}
	
	
	
}
