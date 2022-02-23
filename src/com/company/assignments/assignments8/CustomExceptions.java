package com.company.assignments.assignments8;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomExceptions {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your UserName Please ");

        String userName = scanner.nextLine();
        try {

            if(userName.length() < 5)
            {
                throw new UserNameLengthLess("username length can not be less than 5 characters");
            }
            if(userName.length() > 20)
            {
                throw new UserNameLengthMore("username length can not be More than 20 characters");
            }
            if(!Pattern.matches("(?=.*[0-9]).{5,20}",userName))
            {
                throw new UserNameInvalid("Your username invalid it must contains at least one  or more numbers");
            }

            System.out.println("Your user name is valid");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {

            System.out.println("we are in finally block!!!!");

        }

    }
}
