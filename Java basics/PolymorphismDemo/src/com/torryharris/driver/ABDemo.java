package com.torryharris.driver;

import com.torryharris.model.A;
import com.torryharris.model.B;
import com.torryharris.model.C;

public class ABDemo {

	public static void main(String[] args) {
		A aObj = new A();
		aObj.display();
		aObj.staticFunction();
		System.out.println();
		
		B bObj = new B();
		bObj.display();
		bObj.staticFunction();
		
		System.out.println();
		System.out.println("---A Ref points to B Object---");
		A xObj = new B();
		xObj.display();
		xObj.staticFunction();
		
		System.out.println();
		System.out.println("---A Ref points to C Object---");
		xObj=new C();
		xObj.display();
		xObj.staticFunction();
	}

}
