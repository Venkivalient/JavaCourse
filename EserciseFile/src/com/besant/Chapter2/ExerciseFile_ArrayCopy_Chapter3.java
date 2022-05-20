package com.besant.Chapter2;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class ExerciseFile_ArrayCopy_Chapter3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int acopy[] = { 1, 8, 3 };
		int bcopy[] = new int[acopy.length];// elements not copy, bcopy also refer acopy
		int ccopy[] = new int[acopy.length];
		// Iterating each element of the given original array and copy one element at
		// time
		// Using clone() method
		// using arraycopy
		// copyof()
		// copyofrange()

		for (int m = 0; m < acopy.length; m++) {
			bcopy[m] = acopy[m];
		}
		// bcopy[0]++;
		for (int lk = 0; lk < bcopy.length; lk++) {
			System.out.println(bcopy[lk]);
		}

		int c[] = acopy.clone();

		int kcopy[] = new int[acopy.length];

		// Copying elements of a[] to b[]
		System.arraycopy(acopy, 0, kcopy, 0, 3);

		int a[] = { 1, 8, 3 };

		// Create an array b[] of same size as a[]
		// Copy elements of a[] to b[]
		int b[] = Arrays.copyOf(a, 3);

		// For-each loop in Java
		// For-each loops do not keep track of index
		// For-each only iterates forward over the array in single steps
		long startTime;
		long endTime;
		long startMc;
		long startPc;

		startTime = Calendar.getInstance().getTimeInMillis();

		for (int ellam : b) {
			System.out.println(ellam);
		}
		endTime = Calendar.getInstance().getTimeInMillis();
		System.out.println("For each loop :: " + (endTime - startTime) + " ms");

		startMc = Calendar.getInstance().getTimeInMillis();
		for (int mc = 0; mc < b.length; mc++) {
			System.out.println(b[mc]);
		}
		startPc = Calendar.getInstance().getTimeInMillis();
		System.out.println("For startP loop :: " + (startMc - startPc) + " ms");

	}

}
