package com.tns.day5;

public class HierarchicalDemo {

	public static void main(String[] args) 
	{
	Person p;
	p=new Student("anusha","bangalore","6th sem",12.34f);
	System.out.println(p);
	p = new Employee("Nikhil", "Mumbai", 101, 67000, "Sales");
	System.out.println(p);
	}

}
