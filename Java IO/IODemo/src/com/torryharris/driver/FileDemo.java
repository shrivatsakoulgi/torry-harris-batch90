package com.torryharris.driver;


import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("file2.txt");
		String str="Hello.. this is my Second File I/O program";
		byte []bytes = str.getBytes();
		
		for(int i=0;i<bytes.length;i++) {
			fos.write((int)(bytes[i]));
		}
		//fos.write(bytes);
		fos.close();
		System.out.println("File written successfully");
	}

}
