package edu.neu.csye6200.electronicItem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.neu.csye6200.FileUtil;
import edu.neu.csye6200.item.Item;

public class ElectronicItem extends Item{
	private ElectronicItem(String row) {
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
	private static Map<String, ElectronicItem> items = null;
	protected static Map<String, ElectronicItem> getItems(){
		if(items == null) {
			Map<String, ElectronicItem> map = new HashMap<>();
			List<String> data = FileUtil.getParsedFileData("ElectronicItemCSV.txt");
			for(String row :data) {
				ElectronicItem item = new ElectronicItem(row);
				map.put(item.getName(), item);
			}
			items = map;
		}
		return items;
	}
	@Override
	public String toString() {
		return "This is ElectronicItem "+this.name+" ID: "+this.id+" price: "+this.price;
	}
}
