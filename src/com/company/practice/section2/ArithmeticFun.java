package com.company.practice.section2;

public class ArithmeticFun {
    public static void main(String[] args) {

        int a=10;
        int b=15;
        System.out.println("-----------------BINARY OPERATOR--------------------");
        int result=a+b;
        int difference=a-b;
        int product=a*b;
        int quotient=b/a;
        int remainder=b%a;


        System.out.println("result is: "+result);
        System.out.println("difference is: "+difference);
        System.out.println("product is: "+product);
        System.out.println("quotient is: "+quotient);
        System.out.println("remainder is: "+remainder);

        // compound operators or shortcut operators
        // +=, -=, *=, /=, %=

        result+=20; //result=result+20;
        difference-=-5; //difference=difference-(-5);
        product*=2; //product=product*2;
        quotient/=2; //quotient=quotient/2;
        remainder%=4; //remainder=remainder%4
        System.out.println("-------------------------------------");
        System.out.println("result is: "+result);
        System.out.println("difference is: "+difference);
        System.out.println("product is: "+product);
        System.out.println("quotient is: "+quotient);
        System.out.println("remainder is: "+remainder);
        System.out.println("-----------------UNARY OPERATOR--------------------");

        //UNARY OPERATOR

        result=++result;  // increment operator
        System.out.println(result);

        product=--product; // decrement operator
        System.out.println(product);

    }
}
