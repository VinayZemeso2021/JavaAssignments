package com.company.practice.stringPractice;

import java.util.Arrays;

public class Splittable {

	public static void main(String[] args) {
		
		String s1="abcPjklPxyz";
		int count=0;
		System.out.println(s1);
		for (int i = 0; i < s1.length(); i++) 
		{
			if(s1.charAt(i)=='P')
				count++;
		}
		String[] ca=new String[++count];
		
		String s2="";
		int index=0;
		for (int i = 0; i < s1.length(); i++) 
		{
			char ch=s1.charAt(i);
			if(ch!='P')
			{
				s2=s2+ch;
			}
			else
			{
				ca[index++]=s2;
				s2=" ";
			}
				if(i==s1.length()-1)
				{
					ca[index++]=s2;
					
				}
				
		}
		
	
		System.out.println(Arrays.toString(ca));
	}

}
