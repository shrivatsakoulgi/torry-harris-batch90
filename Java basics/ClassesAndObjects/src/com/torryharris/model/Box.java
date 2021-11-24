package com.torryharris.model;

public class Box {

	private int length;
	private int width;
	private int height;
	
	public Box() {
		System.out.println("\nIn the Constructor of Box...\n");
	}

	public Box(int length,int width, int height) {
		System.out.println("\nIn the Parameterized "
				+ "Constructor of Box...\n");
		this.length=length;
		this.width=width;
		this.height=height;
	}
	
	public int getVolume() {
		return (length*width*height);
	}
}
