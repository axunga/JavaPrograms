package com.Anagram.app;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		String word1 = "Abc";
		String word2 = "bca";
		int word1Count = 0;
		int word2Count = 0;
		
		for(int i=0 ; i<word1.length() ; i++) {
			word1Count += word1.toLowerCase().charAt(i);
		}
		for(int i=0 ; i<word2.length() ; i++) {
			word2Count += word2.toLowerCase().charAt(i);
		}
		
		if(word1Count == word2Count)
		{
			System.out.println(word1 + " and " + word2 + " are anagrams");
			System.out.println(word2Count);
		
		}else
		{
			System.out.println(word1 + " and " + word2 + " are not anagrams");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
