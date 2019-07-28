/*
 * Basic HiWorld program with user name
 */
package com.HiWorld.app;

import java.util.Scanner;

public class HiWorldMain {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		String userName = sn.nextLine();
		
		System.out.println("\nHi " + userName + " this is a Hi World program in java.");
		
		sn.close();
	}
}
