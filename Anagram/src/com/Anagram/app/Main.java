package com.Anagram.app;

public class Main {

	public static void main(String[] args) {
/*
		String word1 = "Abc";
		String word2 = "cBa";
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
		
		}else
		{
			System.out.println(word1 + " and " + word2 + " are not anagrams");
		}*/
		
		int[] statues = {6, 2, 3, 8};//4.5.7     f-i 2345678 6
	    
	    int max = statues[0];
	    int min = statues[0];
	    for(int i : statues)
	    {
	        if(i < min)
	        {
	            min = i;
	        }
	        if(i > max)
	        {
	        	max = i;
	        }
	    }
	    System.out.println(min);
	    System.out.println(((max-min)+1)-statues.length);
		
	}

}
