package test;

import java.util.Scanner;

public class Demo2 {
	
	public static void main(String []args) {
	int age;
	Scanner input=new Scanner(System.in);
	age=input.nextInt();
	try
	{
	if(age<0 || age>110) {
		throw new IllegalAgeException("Improper Age Value!!");
	}
	}
	catch(IllegalAgeException e) {
		System.out.println(e.toString());
	}

}
}
