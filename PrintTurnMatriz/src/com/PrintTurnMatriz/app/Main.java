/**
 * @author AXEL
 * Ask the user for a number to turn a random matriz  
 */
package com.PrintTurnMatriz.app;

import com.PrintTurnMatriz.model.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sn = new Scanner(System.in);
		System.out.print("Ingrese el numero de vueltas que quiere que de su matriz: ");
		int contador = sn.nextInt();
		sn.close();
		
		int[] randArray1 = new int[4];
		int[] randArray2 = new int[4];
		int[] randArray3 = new int[4];
		int[] randArray4 = new int[4];
		
		
		for(int i=0; i<randArray1.length; i++)
		{
			randArray1[i] = ran.nextInt(101);
			randArray2[i] = ran.nextInt(101);
			randArray3[i] = ran.nextInt(101);
			randArray4[i] = ran.nextInt(101);
		}

		Posicion pos = new Posicion();
		
		int i = 1;
		int conteo = 1;
		do
		{
			switch(conteo)
			{
			case 1:
				pos.posicion1(randArray1, randArray2, randArray3, randArray4);
				conteo++;
				break;
			case 2:
				pos.posicion2(randArray1, randArray2, randArray3, randArray4);
				conteo++;
				break;
			case 3:
				pos.posicion3(randArray1, randArray2, randArray3, randArray4);
				conteo++;
				break;
			case 4:
				pos.posicion4(randArray1, randArray2, randArray3, randArray4);
				conteo = 1;
				break;
			}
			i++;
		}while(contador>=i);
	}

}
