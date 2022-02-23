package com.company.assignments.assignments4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class KYC {

    public static void main(String[] args) throws ParseException {
        int numberOfTestCases;
        System.out.println("Enter Number Of Test Case");
        Scanner sc = new Scanner(System.in);
        numberOfTestCases = sc.nextInt();

        while(numberOfTestCases>0)
        {
            String date1=sc.next();
            String date2=sc.next();
            Date signupDate=new SimpleDateFormat("dd-MM-yyyy").parse(date1);
            Date currentDate=new SimpleDateFormat("dd-MM-yyyy").parse(date2);
            if(currentDate.compareTo(signupDate)>0)
            {
                Date start,end,cal;
                cal=signupDate;
                cal.setYear(currentDate.getYear());
                Calendar calendar=Calendar.getInstance();
                calendar.setTime(cal);
                calendar.add(Calendar.DATE, 30);
                end=calendar.getTime();
                calendar.add(Calendar.DATE,-60);
                start=calendar.getTime();
                if(end.compareTo(currentDate)>0)
                    end=currentDate;
                SimpleDateFormat print=new SimpleDateFormat("dd-MM-yyyy");
                System.out.println(print.format(start)+"  "+print.format(end));

            }
            else
            {
                System.out.println("No range");
            }
            numberOfTestCases--;

        }
    }

}