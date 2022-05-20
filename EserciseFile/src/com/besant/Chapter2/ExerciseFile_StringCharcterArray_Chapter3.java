package com.besant.Chapter2;

import java.util.Arrays;

public class ExerciseFile_StringCharcterArray_Chapter3 {
 // Find a string from the array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strAr1=new String[] {"Ani", "Sam", "Joe"};
		String[] strAr2 = {"Ani", "Sam", " Joe"};  
		
		String[] colors = {"Cricket","Basketball","Football","Badminton","Tennis"};
		  Arrays.sort(colors);
		  
		  for (String c:colors) {  
		        System.out.println(c);  
		        }  
		  

      char[] JavaCharArray = new char[5];
      JavaCharArray[0] = 'a';  
      JavaCharArray[1] = 'b';  
      JavaCharArray[2] = 'c';  
      JavaCharArray[3] = 'd';  
      JavaCharArray[4] = 'e';
      
      for (char c:JavaCharArray) {  
          System.out.println(c);  
          } 
      
      //String to character
      String value = "BesantJ2ee"; //Enter String  
      //Convert string to a char array.  
      char[] array = value.toCharArray(); // Conversion to character from string  
      for(char c : array) //Iterating array values  
      {  
      System.out.println(c);  
      }  
      //Count the point in the string
      String values = "BesantJ2ee"; //Enter String  
      //Convert string to a char array.  
      char[] arrayd = value.toCharArray(); // Conversion to character from string  
      char c='e';
      int ccount=0;
      for(int ij=0;ij<arrayd.length;ij++) //Iterating array values  
      {  
    	  
    	  if(arrayd[ij]==c)
    	  {
    		  ccount++;
    	  }
       
      } 
      System.out.println(ccount); 
      
	}

}
