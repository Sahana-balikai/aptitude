package com.sahana;

public class Replace2 {
	public static String replace(String str) {
		System.out.println(str);
		String str1=str.replace("name", "sahana");
		return str1;
	}
	public static void main(String[] args) {
		String str2=replace("hi name welcome to string execution");
		System.out.println(str2);
	}

}
