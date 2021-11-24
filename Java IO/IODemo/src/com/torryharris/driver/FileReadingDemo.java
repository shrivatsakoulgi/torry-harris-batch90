package com.torryharris.driver;


import java.io.FileInputStream;

import java.io.IOException;

public class FileReadingDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("file.txt");
		int i;
		while( (i=fis.read())!=-1) {
				System.out.print((char)i);
		}
		fis.close();
	}

}
