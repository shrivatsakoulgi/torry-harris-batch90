package com.torryharris.model;

public class Utility {
	
	public String concatString(String str1,String str2) {
		return (str1.concat(str2));
	}

	public boolean primeOrNot(int number) {
		
		for(int i=2;i<number/2;i++) {
			if(number%i==0)
				return false;
		}
		return true;
	}
	
	public int square(int num) {
		return num*num*num;		// mistake
	}
	
	public int largest(int []array) {
		int max=array[0];
		for(int i=01;i<array.length;i++) {
			if(array[i]>max)
				max=array[i];
		}
		return max;
	}
}
