package com.sahana.alphabets;

public class printD {
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
                && j < height - 1) 
                System.out.printf("*"); 
            else if (j == height - 1 && i != 0
                    && i != height - 1) 
                System.out.printf("*"); 
            else
                System.out.printf(" "); 
        } 
        System.out.printf("\n"); 
    } 

}
}
