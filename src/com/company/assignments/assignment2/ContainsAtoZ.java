package com.company.assignments.assignment2;

import java.util.HashSet;
import java.util.Scanner;

public class ContainsAtoZ {

    public static void main(String[] args) {

        //Write a java function that checks if the input string contains all the letters of
        // the alphabet a-z (case-insensitive).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the input String");

        String inputString = scanner.nextLine();

        boolean checker = checkString(inputString);

        if(checker)
        {
            System.out.println("It contains all a to z characters");
        }
        else
            System.out.println("It does not contain all a to z characters");

    }

    private static boolean checkString(String inputString)
    {
        HashSet<Character> characters = new HashSet<>();
        if(inputString.length() >= 25) {
            for (int i = 0; i < inputString.length(); i++) {
                char tempChar = inputString.charAt(i);

                if ((tempChar >= 'a' && tempChar <= 'z' || tempChar >= 'A' && tempChar <= 'Z') && (characters.size() <= 25)) {
                    characters.add(Character.toUpperCase(tempChar));
                }
            }

            return characters.size() == 26;
        }
        else
            return false;
    }

}