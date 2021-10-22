package edu.neu.csye6200.item;

public class Item {
	
	protected String name;
	protected int id;
	protected double price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "This is of type Item super class";
	}
	public static void temp() {
		
	}
	public int sortByName(Item t) {
		return this.name.compareTo(t.name);
	}
	
	public int sortById(Item t) {
		return ((Integer)this.getId()).compareTo(t.getId());
	}
	
	public int sortByPrice(Item t) {
		return ((Double)this.getPrice()).compareTo(t.getPrice());
	}
}
