package com.company.practice.section2;

import java.util.Scanner;

public class AverageOfThreeNumber {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter three numbers");
        double num1=scanner.nextDouble();
        double num2=scanner.nextDouble();
        double num3=scanner.nextDouble();

        final int TOTAL_NUMBER_COUNT=3;
        double average=(num1+num2+num3)/TOTAL_NUMBER_COUNT;

        System.out.println("Average is:"+average);
    }
}
