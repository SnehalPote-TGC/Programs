package com;

import java.util.List;

public class MaxNumber {
	public static void main(String[] args) {
		/*
	
		 int [] arr = new int [] {25, 11, 7, 75, 56};  
	        int lar = arr[0]; 
	        int seclar = arr[0];
	        for (int i = 0; i < arr.length; i++) {  
	           if(arr[i] > lar)  {
	        	   lar = arr[i];  
	             }
	           
	        }  
	        System.out.println("Largest element present in given array: " + lar); 
	        
	        */
	        int temp, size,i,j;
	        int array[] = {10, 20, 25, 63, 96, 57};
	        size = array.length;

	        for( i = 0; i<size; i++ ){
	           for( j = i+1; j<size; j++){

	              if(array[i]>array[j]){
	                 temp = array[i];
	                 array[i] = array[j];
	                 array[j] = temp;
	              }
	           }
		        //System.out.println("Third second largest number is:: "+array[i]);

	        }
	        // System.out.println("Third second largest number is:: "+array[]);
	
		/*
		int [] arr = new int [] {1, 2, 3, 3, 2};  
		int count =0;
		 for (int i = 0; i < arr.length; i++) {  
			 for (int j = i+1; j < arr.length; j++) {  
			 
			 
	           if(arr[i] == arr[j]) 
	           {
	      		// System.out.println(arr[i]);
			   		System.out.println(arr[j]);

	               count ++;
	        } 

			 }

	}  
		int[] arr = new int [] {1, 2, 3, 4, 5,6,7};  
		 for (int i = 0; i < arr.length; i++) {  
		if(arr[i]%2 == 0) {
			//int [] arr1 = arr[i];
			
			System.out.print(arr[i]);
			
		}
		 }
		
		
*/
	}
	}


