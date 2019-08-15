/**
 * @author AXEL
 * Program that multiple in the array with the ones next to it and print the largest result
 */
package com.largestProductBetTwoElementsInArray.app;

public class Main {

	public static void main(String[] args) {

		int[] inputArray = {-23, 4, -3, 8, -12};
		int largestProd = -1000000;
		
		for(int i=0 ; i<inputArray.length-1 ; i++)
		{
			if((inputArray[i] * inputArray[i+1]) > largestProd)
			{
				largestProd = (inputArray[i] * inputArray[i+1]);
			}
		}
		System.out.print(largestProd);
		
	}

}
