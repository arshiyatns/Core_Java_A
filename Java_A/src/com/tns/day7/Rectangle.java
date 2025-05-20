package com.tns.day7;

public class Rectangle extends Shape
{
	
	private float width;
	private float height;
	
	public Rectangle()
	{
		this.width=2.0f;
		this.height=5.0f;
	}

	@Override
	void calArea() {
		area= width*height;
		
	}

}
