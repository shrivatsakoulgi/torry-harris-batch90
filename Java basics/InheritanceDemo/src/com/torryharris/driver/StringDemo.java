package com.torryharris.driver;

public class StringDemo {

	public static void main(String[] args) {
		
		String s1="abcd";
		String s2=new String("efgh");
		String s3=s1+s2;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1.charAt(2));
		System.out.println(s1.compareTo("abef"));
		System.out.println(s1.indexOf('z'));
		System.out.println(s1.toUpperCase());
		
	}

}
