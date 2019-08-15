package com.BurbbleSort.app;

import com.BurbbleSort.model.*;
import java.util.Random;

public class Main {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Random rn = new Random();
		Sort sort = new Sort();
		int[] arr = new int[100];
		
		for(int i=0 ; i<100 ; i++)
		{
			arr[i] = rn.nextInt(101);
		}
		sort.bubbleSort(arr);
		for(int i=0 ; i<100 ; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

}
