package com.torryharris.driver;

import com.torryharris.model.Box;

public class BoxDemo {

	public static void main(String[] args) {
		
		Box box1 = new Box(10,20,30);

		System.out.println("The volume of Box is:"+box1.getVolume());
		
		Box box2 = new Box(5,5,5);
		
		Box box3=new Box();
		
		System.out.println("Hashcode of Box1:"+box1.hashCode());
		System.out.println("Hashcode of Box2:"+box2.hashCode());
		
		System.out.println("Hashcode of Box3:"+box3.hashCode());
		
	
		System.out.println("Box3 volume:"+box3.getVolume());
		
		
	}

}
