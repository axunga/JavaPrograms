/**
 * @author AXEL
 * Missing numbers inside a disordered array
 */
package com.findTheMissingNumber.app;

import com.findTheMissingNumber.model.*;

public class Main {

	public static void main(String[] args) {
		
		BurbbleSort sort = new BurbbleSort();
		int[] randArr = {7,8,9,4,6,1,2,3,0,10,12};
		
		sort.bubbleSort(randArr);
		for(int i=1 ; i<randArr.length ; i++)
		{
			if(randArr[i-1] != (randArr[i]-1))
			{
				System.out.println("The missing number is: " + ((randArr[i])-1));
			}
		}
	
	}
}
