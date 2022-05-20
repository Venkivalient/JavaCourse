package com.besant.Chapter2;

import java.util.Scanner;

public class ExerciseFile_Array_Chapter3 {
	
	public static void printAttay(int[] Array, int Size)
	{
		for (int Number: Array) 
		{
			System.out.print(Number + " ");
		}
	}
	private static Scanner sc;   

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10,20,30,56,50};
		int b[] = {12,23,43};
		int c[] = new int[3];
         c[0] =1;
         c[1]=2;
         c[2]=4;
        // In a situation where the size of the array and variables of the array are already known, array literals can be used. 

         int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
         
         int intArray1[];    //declaring array
         intArray1 = new int[20];  // allocating memory to array
         int[] intArray2 = new int[20];
         
        // The elements in the array allocated by new will automatically be initialized to zero (for numeric types), false (for boolean), or null (for reference types). Refer Default array values in Java
         //Obtaining an array is a two-step process. First, you must declare a variable of the desired array type. Second, you must allocate the memory to hold the array, using new, and assign it to the array variable. Thus, in Java, all arrays are dynamically allocated.

		
		  for (int i = 0; i <a.length; i++) {
		  System.out.println("Forward Element at index " + i + " : "+ a[i]); 
		  }
		 
         for (int i = a.length-1; i>=0; --i) {
       	  System.out.println("Reverse Element at index " + i + 
       	                                " : "+ a[i]);
         }
         
         
         int l=0;
         //Find the sum from the array
         for (int i = 0; i <a.length; i++) {
   		 
        	 l=l+a[i];
        	 
   		 }
         System.out.println("Sum"+l);
         
         //Ascending Order
         for (int i = 0; i <a.length -1; i++) {
        	 for (int j = 0; j<a.length-i-1; j++) {
        			 if(a[j]>a[j+1])
        			 {
        			int temp=a[j];	 
        			a[j] = a[j + 1];
                    a[j + 1] = temp;
        			 
        	 
        		 }
        		 
        		 }
        	
 		 }
         for (int i = 0; i < a.length; ++i)
	            System.out.print(a[i] + " ");
	        System.out.println();
	        
	        int Size, i;
			sc = new Scanner(System.in);
		 
			System.out.print(" Please Enter Number of elements in an array : ");
			Size = sc.nextInt();	
			
			int [] a1 = new int[Size];
			int [] b1 = new int[Size];
			
			System.out.print(" Please Enter " + Size + " elements of First Array  : ");
			for (i = 0; i < Size; i++)
			{
				a1[i] = sc.nextInt();
			}
			
			System.out.print(" Please Enter " + Size + " elements of Second Array  : ");
			for (i = 0; i < Size; i++)
			{
				b1[i] = sc.nextInt();
			}
			
			for(i = 0; i < Size; i++)
			{
			   int temp = a1[i];
				
				a1[i] = b1[i];
			    b1[i] = temp;
			}
			
			System.out.print("\n First  Array Elements (a[]) After Swapping :  ");
			printAttay(a1, Size);
			System.out.print("\n Second Array Elements (b[]) After Swapping :  ");
			printAttay(b1, Size);
			
			System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Copy Of Array>>>>>>>>>>>>>>>>>>>>>>>>>");
			
			
			
			
			
		}
		
	        
	

}
