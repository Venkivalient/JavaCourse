package com.besant.Chapter2;

public class ExerciseFile_Operator_Chapter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
	    int y = 3;
	    System.out.println(x + y);
	    System.out.println(x * y);
	    System.out.println(x / y);
	    System.out.println(x % y);
	    System.out.println(x - y);
	    System.out.println("<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>");
	    System.out.println(x++ +y);
	    System.out.println(x++ +y);
	    System.out.println(--x);
	    System.out.println(++x);
	    
	    System.out.println("<<<<<<<<<<<<<<<<<<<<<Asighnment>>>>>>>>>>>>>>>>>>>>>>>");
	    
	    int a = 10;
	    a += 5;
	    System.out.println(a);
	    
	    System.out.println("<<<<<<<<<<<<<<<<<<<<<Right angle>>>>>>>>>>>>>>>>>>>>>>>");
	    
	    int c=0;
	    
	    int p=2;
	    int p1=-2;
	    
	    System.out.println(c=2<<2);//0010.......> 1000 //Sighned left shift
	    
	    System.out.println(c=2<<1);//0010.......> 0100 //Sighned Left shift
	    
	    System.out.println(c=2>>1);//0010.......> 0010 //Sighned Right shift
	    
	    System.out.println(c=2>>>1);//0010.......> 0010 //Unsighned Right shift
	    
	    System.out.println(c=p>>>1);//0010.......> 0010 //Unsighned Right shift
	    
	    System.out.println(c=p1>>>1);//0010.......> 0010 //Unsighned Right shift
	    
	    
	    System.out.println("<<<<<<<<<<<<<<<<<<<<<left angle>>>>>>>>>>>>>>>>>>>>>>>");
	    
	    System.out.println(x<<y);
	}

}
