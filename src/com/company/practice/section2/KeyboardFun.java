package com.company.practice.section2;

import java.util.Scanner;

public class KeyboardFun {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name;
        int age;
        String city;
        System.out.println("what is your name");
        name=scanner.nextLine();
        System.out.println("Hello, "+name);

        System.out.println("what is your age "+name+"?");
        age=scanner.nextInt();

        scanner.nextLine(); // solution for problem

        System.out.println("what is your city "+name+"?");
        city=scanner.nextLine();

        System.out.println(name+" your age is "+age);
        System.out.println(name+" your city is "+city);

    }
}