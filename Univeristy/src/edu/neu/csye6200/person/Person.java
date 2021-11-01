package edu.neu.csye6200.person;

public class Person extends AbstractPersonAPI{

	private int id;
	private String firstName;
	private String lastName;
	private int age;
	
	public Person (int id, String firstName, String lastName, int age){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		
	}
	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String getFirstName() {
		return this.firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String getLastName() {
		return this.lastName;
	}

	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int getAge() {
		return this.age;
	}

	@Override
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void show() {
		
		
	}
	
	public String toString() {
		return "id: "+this.id+" firstName: "+this.firstName+" lastName: "+this.lastName+" age: "+this.age;
	}
	@Override
	public int sortByFirstName(AbstractPersonAPI p) {
		return this.firstName.compareTo(p.getFirstName());
	}
	@Override
	public int sortByLastName(AbstractPersonAPI p) {
		return this.lastName.compareTo(p.getLastName());
	}
	@Override
	public int sortByAge(AbstractPersonAPI p) {
		return ((Integer)this.age).compareTo(p.getAge());
	}
	@Override
	public int sortById(AbstractPersonAPI p) {
		return ((Integer)this.id).compareTo(p.getId());
	}
	
	
	

}
