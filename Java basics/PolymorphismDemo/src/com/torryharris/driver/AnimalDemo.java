package com.torryharris.driver;

import com.torryharris.interfaces.Bird;
import com.torryharris.interfaces.Mammal;
import com.torryharris.model.Bat;
import com.torryharris.model.Cow;
import com.torryharris.model.Eagle;
import com.torryharris.model.Pigeon;
import com.torryharris.model.Tiger;

public class AnimalDemo {
	public static void main(String[] args) {	
		Cow cow = new Cow();
		cow.eat();
		cow.feed();
		System.out.println();
		
		Tiger tiger = new Tiger();
		tiger.eat();
		tiger.feed();
		System.out.println();
		
		Pigeon pigeon = new Pigeon();
		pigeon.eat();
		pigeon.fly();
		System.out.println();
		
		Eagle eagle = new Eagle();
		eagle.eat();
		eagle.fly();
		System.out.println();
		
		Bat b1 = new Bat();
		b1.eat();
		b1.feed();
		b1.fly();
		System.out.println();
		
		System.out.println("-- Mammal ref, Bat Object  ---");
		Mammal b2 = new Bat();
		b2.eat();
		b2.feed();		// Can't access fly() method
		System.out.println();
		
		System.out.println("-- Bird ref, Bat Object  ---");
		Bird b3 = new Bat();
		b3.eat();
		b3.fly();	// Can't access feed() method
		
		
	}
}
