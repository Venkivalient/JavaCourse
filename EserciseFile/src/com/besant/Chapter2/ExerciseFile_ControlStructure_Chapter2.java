package com.besant.Chapter2;

public class ExerciseFile_ControlStructure_Chapter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //if statement
//if-else statement
		//Java switch statement 
		//for loop
		//while loop
		//do while
		//break
		//continue
		
		 for(int i=1;i<=10;i++){  
		        if(i==5){  
		            //using continue statement  
		            continue;//it will skip the rest statement  
		        }
		        if(i==7){  
		            //using continue statement  
		            break;//it will skip the rest statement  
		        }
		        System.out.println(i);  
		    }  
		 
		 int i=1;  
		    while(i<=10){  
		        System.out.println(i);  
		    i++;  
		    }  
		    
		    int ij=1;    
		    do{    
		        System.out.println(i);    
		    ij++;    
		    }while(i<=10); 
		    int age=20;  
		    //checking the age  
		    if(age>18){  
		        System.out.print("Age is greater than 18");  
		    }  
		    
		    int number=13;  
		    //Check if the number is divisible by 2 or not  
		    if(number%2==0){  
		        System.out.println("even number");  
		    }else{  
		        System.out.println("odd number");  
		    }  
		    
		    int numbers=20;  
		    //Switch expression  
		    switch(numbers){  
		    //Case statements  
		    case 10: System.out.println("10");  
		    break;  
		    case 20: System.out.println("20");  
		    break;  
		    case 30: System.out.println("30");  
		    break;  
		    //Default case statement  
		    default:System.out.println("Not in 10, 20 or 30");  
		    }  
		    
		
	}

}
