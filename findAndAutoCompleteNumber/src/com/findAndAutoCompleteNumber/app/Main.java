package com.findAndAutoCompleteNumber.app;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {
	
	public static String getAreaCode(String num)
	{
		String[] splited = num.split("-");
		return splited[1];
	}

	public static void main(String[] args) {
		
		//save phone numbers
		Scanner sn = new Scanner(System.in);
		LinkedList<String> num  = new LinkedList<String>(Arrays.asList("1356-6666-4835", "1548-3333-5486", "9991-6666-4581", "4885-3333-5488", "4991-8888-1235"));
		
		//print phones and format
		System.out.println("Format number: prefix-area code-line number");
		System.out.println("Numbers saved: " + num + "\n\n");
		
		//Show codes availables
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for(int i=0 ; i<num.size() ; i++)
		{
			hm.put(getAreaCode(num.get(i)), i);
		}
		
		System.out.print("Area codes options: " + hm.keySet());
		
		//find area code
		System.out.print("\n\nEnter area code: ");
		String areaCode = sn.next();
		
		//print options phones
		System.out.println("\nOptions: ");
		for(int i=0 ; i<(num.size()) ; i++)
		{
			String areaCodeReturned = getAreaCode(num.get(i));
			if(areaCode.equals(areaCodeReturned))
			{
				System.out.println(num.get(i));
			}
		}

	}
}
