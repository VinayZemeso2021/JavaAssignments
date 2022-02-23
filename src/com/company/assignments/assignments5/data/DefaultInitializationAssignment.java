package com.company.assignments.assignments5.data;

public class DefaultInitializationAssignment {

    int var1;
    char var2;

    public void printVar(){
        System.out.println(var1);
        System.out.println(var2);
    }

    public void printLocalVar(){
        int localVar1;
        char localVar2;


        //System.out.println(localVar1);  shows error here
        // System.out.println(localVar2);
    }
}