package com.sahana;

public class Chararray2 {
	public static char[] chararray(String name) {
		char[] charr=name.toCharArray();
		return charr;
		
	}
	
	public static void main(String[] args) {
		Chararray2 chararray2 =new Chararray2();
		char[] charr1=Chararray2.chararray("sahana");
		for(int i=0;i<charr1.length;i++) {
			System.out.println(charr1[i]);
		}
	}

}
