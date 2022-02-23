package com.company.practice.stringPractice;

public class endsWith {

	public static void main(String[] args) {
		// Ends With
		String s1="Vinayak";
		String s2="yak";
		
		if(s2.length()>s1.length())
			System.out.println("False1");
		else
		{
			int i=s1.length()-1;
			int j=s2.length()-1;
			while (j>=0) 
			{
				if(s1.charAt(i)!=s2.charAt(j))
				{
					System.out.println("False2");
					break;
				}
				i--;
				j--;
			}
			if(j==-1)
				System.out.println("True");
		}
	}

}
