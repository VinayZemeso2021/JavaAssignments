package com.company.practice.stringPractice;

import java.util.Scanner;

public class WhiteSpace {

	public static void main(String[] args) {

		//Scanner sc=new Scanner(System.in);
		String s1="  Welcome    to      v";
		
		String s2="";
		int start=0;
		int end=s1.length()-1;
		while(true)
		{
			if(s1.charAt(start)==' ')
				start++;
			else
				break;
		}
		while(true)
		{
			if(s1.charAt(end)==' ')
				end--;
			else
				break;
		}
		for (int i = start; i <=end; i++) 
		{
			if(s1.charAt(i)==' ' && s1.charAt(i+1)==' ')
			{
				
			}
			else
			{
				s2=s2+s1.charAt(i);
			}
				
				
		}
		System.out.println(s2);
				
	}

}
