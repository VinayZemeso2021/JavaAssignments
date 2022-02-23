package com.company.practice.stringPractice;

public class StartsWith {

	public static void main(String[] args) {
		// Star With
		
		String s="Vinayak";
		String s2="Vinay";
		if(s2.length()>s.length())
		{
			System.out.println("False1");
		}
		else
		{
		int counter=0;
		for (int i = 0; i<s2.length(); i++) 
		{
			if(s.charAt(i)!=s2.charAt(i))
			{
				counter++;
				break;
			}
		}
		if(counter==0)
			System.out.println("True");
		else
			System.out.println("False2");
		}
	}

}
