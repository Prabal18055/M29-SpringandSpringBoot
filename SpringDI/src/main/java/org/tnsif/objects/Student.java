package org.tnsif.objects;

public class Student {
	
	Address address;

	public Student(Address address) {
		super();
		this.address = address;
	}
	public void print()
	{
		address.display();
	}

}
