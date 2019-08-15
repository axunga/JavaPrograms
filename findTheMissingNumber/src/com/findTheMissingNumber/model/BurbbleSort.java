package com.findTheMissingNumber.model;

public class BurbbleSort {
	 	
	public static void bubbleSort(int[] arr) 
	{    
        int aux = 0; 
        
         for(int i=0; i < arr.length; i++)
         {  
             for(int j=1; j < arr.length; j++)
             {  
                  if(arr[j-1] > arr[j])
                  {   
                         aux = arr[j-1];  
                         arr[j-1] = arr[j];  
                         arr[j] = aux;  
                  }       
             }  
         }
    }
}
