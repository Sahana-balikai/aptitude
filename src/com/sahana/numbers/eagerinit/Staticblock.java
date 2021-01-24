package com.sahana.numbers.eagerinit;

public class Staticblock {
	static int i; 
    int j;  
    static { 
        i = 10; 
        System.out.println("static block called "); 
    } 
    
    
    public static void main(String[] args) {
		System.out.println(Staticblock.i);
	}

}
