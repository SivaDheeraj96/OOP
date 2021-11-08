package edu.neu.csye6200;

	public abstract class AbstractPersonAPI {
		
		public abstract int getId();
		public abstract void setId(int id);
		public abstract String getFirstName();
		public abstract void setFirstName(String firstName);
		public abstract String getLastName();
		public abstract void setLastName(String lastName);
		public abstract int getAge();
		public abstract void setAge(int age);
		public abstract void show();
		
		public abstract int sortById(AbstractPersonAPI p);
		public abstract int sortByFirstName(AbstractPersonAPI p);
		public abstract int sortByLastName(AbstractPersonAPI p);
		public abstract int sortByAge(AbstractPersonAPI p);
	}



