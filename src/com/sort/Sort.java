package com.sort;

import com.driver.Driver; 

public class Sort {    
	Driver driver= new Driver();
	static double arr[];
    public static double[] sortasc(String[] args) {        
        //Initialize array     
        double temp = 0;    
        arr= Driver.pricearr;
                    
        //Sort the array in ascending order    
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }
      //Displaying elements of array after sorting    
	    for (int i = 0; i < arr.length; i++) {     
	        System.out.print(arr[i] + " ");    
	    }
		return arr;
}

    public static double[] sortdsc(String[] args) {        
        //Initialize array     
        double temp = 0;    
        arr= Driver.pricearr;
            
            
        //Sort the array in descending order    
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] < arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
            
        System.out.println();    
            
        //Displaying elements of array after sorting    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }  
        return arr;
    }    
}    

