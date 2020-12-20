package com.sahana.alphabets;

public class printE {
	int height = 5;
	int width = (2 * height) - 1; 
	int i, j; 
	{
    for (i = 0; i < height; i++)  
    { 
        System.out.printf("*"); 
        for (j = 0; j < height; j++)  
        { 
            if ((i == 0 || i == height - 1) 
                || (i == height / 2
                    && j <= height / 2)) 
                System.out.printf("*"); 
            else
                continue; 
        } 
        System.out.printf("\n"); 
    } 

}
}
