package com.company.assignments.assignments5.singleton;

public class DefaultStatic {
    String string;

    static String returnObj(String string){
        /*t Here, the string variable is a non-static member variable which can only be accessed
        using an object, so if we create multiple objects for string it will have separate values
        but the static method here is accessed directly, which creates a confusion for compiler to
        access which object use thus it throws an error.
        his.str = string;
         */
        // return string;
        return "";
    }

    public void printString(){
        System.out.println(string);
    }
}