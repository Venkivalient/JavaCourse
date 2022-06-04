package com.besant.Chapter2;

public class Exercise_CommandLineArgument_Chapter4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Your first argument is: "+args[0]); 
		
		int[] aray = new int[args.length];
		int sum=0;
		for(int i=0;i<args.length;i++)  {
			aray[i]=Integer. parseInt(args[i]);
			sum+=aray[i];
			}
			System.out.println("Command line arrugment" +sum);  
			}  
	}
