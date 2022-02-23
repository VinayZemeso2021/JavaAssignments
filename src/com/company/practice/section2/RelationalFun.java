package com.company.practice.section2;

public class RelationalFun {
    public static void main(String[] args) {
        int myAge=23;
        int yourAge=30;

        boolean ageComparison=myAge>yourAge;
        System.out.println("my age greater than your age ?:"+ageComparison);
        ageComparison=myAge<yourAge;
        System.out.println("my age less than your age ?:"+ageComparison);
        ageComparison=myAge==yourAge;
        System.out.println("my age equal to your age ?:"+ageComparison);
        System.out.println( "------------------------------");

        String myName="john";
        String yourName="john";
        boolean nameComparison=myName.equals(yourName);
        System.out.println("my name equal to your name?:"+nameComparison);


    }
}
