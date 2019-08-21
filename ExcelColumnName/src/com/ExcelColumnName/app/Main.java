/**
 * @author AXEL
 * Having the Excel columns name structure, print the name of the column depending of the number in that position
 * Example:
 * 	A,B,C...Z,AA,AB,AC...BA,BB,CC...BZ
 *  0,1,2..26,27
 */
package com.ExcelColumnName.app;

public class Main {

	public static void main(String[] args) {

		for(int num=0 ; num<=200 ; num++ )
		{
			System.out.println("num: " + num);
			int cen = (num/26);			
			int dec = num%26;
			
			if(cen == 0)
			{
				System.out.print("Column name: ");
				System.out.print((char)(dec+65));
			
			}else if(cen > 0)
			{	
				System.out.print("Column name: ");
				System.out.print((char)(cen+64));
				System.out.print((char)(dec+65));
			}
			System.out.println("\n");
		}
		
	}
}
