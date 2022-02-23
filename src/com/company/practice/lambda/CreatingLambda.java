package com.company.practice.lambda;

/*
creating formal greeting for visitors
given a visitor the program should return an output formally greeting that visitor.
Example :- Input/Output
           "harry"/HELLO, harry
           "Miss Pingu"/ HELLO, Miss Pingu
           ""/Did you forgot something?
*/

public class CreatingLambda {

    /*
    you must one and only one method in interface to use it as lambda expression
     */
    interface Greeting
    {
        public String sayHello(String str);//functional Interface
    }

    public void testGreeting(String str, Greeting greeting)
    {
        String result = greeting.sayHello(str);

        System.out.println("result:"+result);
    }

    public static void main(String[] args) {

        // input
        // (String s) -> "Harry",+str
        new CreatingLambda().testGreeting("Harry",(String str) -> "HELLO, "+str);
        new CreatingLambda().testGreeting("Miss Pingu",(String str) -> "HELLO, "+str);

        new CreatingLambda().testGreeting("",(String str) -> !str.isEmpty()? "Howdy, "+str:"Did you miss something");
        new CreatingLambda().testGreeting("vinay",(String str) -> !str.isEmpty()? "Howdy, "+str:"Did you miss something");
    }

}