package com.company.practice.section2;

public class LogicalFun {
    public static void main(String[] args) {
        boolean isRaining=true;
        boolean isWarm=true;

        boolean combine=isRaining && isWarm;
        System.out.println("is raining AND warm ?:"+combine);
        combine=isRaining || isWarm;
        System.out.println("is raining OR warm ?:"+combine);
        combine=!isRaining;
        System.out.println("is raining?:"+combine);


    }
}
