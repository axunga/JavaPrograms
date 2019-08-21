/**
 * @author AXEL
 * Print if a number is prime or not
 */
package com.PrimeNumber.app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sn.nextInt();
		int contador = 0; 
		
		for(int i=2 ; i<=number ; i++)
		{
			if(number%i == 0)
			{
				contador++;
			}
		}
		if(contador == 1)
		{
			System.out.print(number + " is a prime number");
		
		}else if(contador > 1 )
		{
			System.out.print(number + " is not a prime number");
		
		}else
		{
			System.out.print("Error - try again");
		}
		
	}
}
