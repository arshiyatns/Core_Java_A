package com.tns.day3;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		Person p = new Person();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name:");
		String name=sc.next();
		System.out.println("enetr the age");
		int age =sc.nextInt();
		System.out.println("enter the income");
		int income=sc.nextInt();
		System.out.println("enter the gender");
		String gender=sc.next();
		System.out.println("enter the tax");
		int tax=sc.nextInt();
		//System.out.println(p);

	}

}
