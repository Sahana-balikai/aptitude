package com.sahana;

public class Reverse2 {
	public static String reverse(String str) {
		char name[]=str.toCharArray();
		String rev="";
		for(int i=name.length-1;i>=0;i--) {
			rev=rev+name[i];
		}
		return rev;
	}
	public static void main(String[] args) {
		System.out.println(reverse("hello"));
	}

}
