/**
 * @author AXEL
 * Convertidor de entero a binario
 */

package com.EnteroABinario.app;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> binNum = new ArrayList<Integer>();
		int intNum = 65; //Entero a conertir
		
		while(intNum > 0)
		{
			binNum.add(intNum%2);
			intNum = intNum/2; 
		}
		Collections.reverse(binNum);
		System.out.print(binNum);
	}
}
