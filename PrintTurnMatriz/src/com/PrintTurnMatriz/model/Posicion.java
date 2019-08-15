package com.PrintTurnMatriz.model;

public class Posicion {
	
	public void posicion1(int[] randArray1, int[] randArray2, int[] randArray3, int[] randArray4)
	{
		for(int i=0; i<randArray1.length; i++)
		{	
			System.out.print(randArray1[i] + " ");
		}
		System.out.print("\n");
		for(int i=0; i<randArray1.length; i++)
		{	
			System.out.print(randArray2[i] + " ");
		}
		System.out.print("\n");
		for(int i=0; i<randArray1.length; i++)
		{	
			System.out.print(randArray3[i] + " ");
		}
		System.out.print("\n");
		for(int i=0; i<randArray1.length; i++)
		{	
			System.out.print(randArray4[i] + " ");
		}
		System.out.print("\n\n");
	}
	
	public void posicion2(int[] randArray1, int[] randArray2, int[] randArray3, int[] randArray4)
	{
		for(int i=0; i<randArray1.length; i++)
		{
			System.out.print(randArray4[i] + " ");
			System.out.print(randArray3[i] + " ");
			System.out.print(randArray2[i] + " ");
			System.out.print(randArray1[i] + " ");
			System.out.print("\n");
		}
		System.out.print("\n");
	}
	
	public void posicion3(int[] randArray1, int[] randArray2, int[] randArray3, int[] randArray4)
	{
		for(int i=randArray1.length; i>0; i--)
		{	
			System.out.print(randArray4[i-1] + " ");
		}
		System.out.print("\n");
		for(int i=randArray1.length; i>0; i--)
		{	
			System.out.print(randArray3[i-1] + " ");
		}
		System.out.print("\n");
		for(int i=randArray1.length; i>0; i--)
		{	
			System.out.print(randArray2[i-1] + " ");
		}
		System.out.print("\n");
		for(int i=randArray1.length; i>0; i--)
		{	
			System.out.print(randArray1[i-1] + " ");
		}
		System.out.print("\n\n");
	}
	
	public void posicion4(int[] randArray1, int[] randArray2, int[] randArray3, int[] randArray4)
	{
		for(int i=randArray1.length; i>0; i--)
		{	
			System.out.print(randArray1[i-1] + " ");
			System.out.print(randArray2[i-1] + " ");
			System.out.print(randArray3[i-1] + " ");
			System.out.print(randArray4[i-1] + " ");
			System.out.print("\n");
		}
		System.out.print("\n");
	}

}
