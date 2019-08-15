/**
 * @author AXEL
 * Programa que dado un numero LIMITE, guarda cada caracter de ese numero en un espacio de una lista
 * ejemplo: valor:100, lista: [1,0,0]
 */

package com.eachValueInEachSpaceArray.app;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		int LIMITE = 110;
		
		for(int i=1 ; i<=LIMITE ; i++)
		{
			if(i<10)
			{
				arrList.add(i);

			}else if(i>=10 && i<100)
			{
				arrList.add(i/10);
				arrList.add(i%10);
			
			}else if(i>=100)
			{
				arrList.add(i/100);
				int k = i%100;
				arrList.add(k/10);
				arrList.add(k%10);
			}
		}
		System.out.print(arrList);
	}
}
