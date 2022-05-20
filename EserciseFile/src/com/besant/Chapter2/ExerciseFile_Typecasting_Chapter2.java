package com.besant.Chapter2;

public class ExerciseFile_Typecasting_Chapter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Order
		//byte -> short -> char -> int -> long -> float -> double  (Automatic)
		//double -> float -> long -> int -> char -> short -> byte  (Manual)
		//TypeCasting
		int myInt = 9;
	    double myDouble = myInt; // Automatic casting: int to double, Assigning to double

	    System.out.println(myInt);      // Outputs 9
	    System.out.println(myDouble);
	    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>");
	    
	    double myDouble2 = 9.78d;
	    int myInt2 = (int) myDouble; // Manual casting: double to int, Need to add int in parameter

	    System.out.println(myDouble2);   // Outputs 9.78
	    System.out.println(myInt2);
	    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>");
	    
	    float floata = 6.0f;
	    int myfloat2 = (int) floata;
	    System.out.println(floata);   // Outputs 9.78
	    System.out.println(myfloat2);
	    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>");


	}

}
