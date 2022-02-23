package com.company.assignments.assignments12;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

//stream create sequence of elements
public class Streams {
    //Print the name of all departments in the college?
    public void printDepartments(List<Student> slist) {
        slist.stream().map(Student::getEngDepartment).distinct().forEach(System.out::println);
    }
    //Get the details of all male student in the computer sci department?
    public void getMaleStudentOfCSE(List<Student> slist) {
        slist.stream().filter(student->student.getEngDepartment().equals("Computer Science") && student.gender.equals("Male")).forEach(s -> System.out.println(s.name));
    }

    ////Get the names of all students who have enrolled after 2018?
    public void getNames(List<Student> slist) {
        slist.stream().filter(student -> student.yearEnrollment>2018).map(Student::getName).collect(Collectors.toList()).forEach(System.out::println);
    }

    //How many male and female student are there ?
    public void countMaleFemale(List<Student> slist) {
        slist.stream().collect(groupingBy(Student::getGender)).forEach((k,v)-> System.out.println("Number of "+k+" student : "+v.size()));
    }

    //What is the average age of male and female students?
    public void averageAgeOfMaleFemale(List<Student> slist) {
        slist.stream().collect(groupingBy(Student::getGender,averagingInt(Student::getAge))).forEach((k,v)-> System.out.println("Average age of "+k+" is "+v));
    }

    //Get the details of the highest student having the highest percentage ?
    public void HighestPercentage(List<Student> slist) {
        Student studentPercentage=slist.stream().max(Comparator.comparing(Student::getPerTillDate)).orElseThrow(NoSuchElementException::new);
        System.out.println(studentPercentage.perTillDate);
    }

    //Count the number of students in each department?
    public void countStudent(List<Student> slist) {
        slist.stream().collect(groupingBy(Student::getEngDepartment)).forEach((k,v)-> System.out.println(k+"Department has "+v.size()+" Students."));
    }

    //What is the average percentage achieved in each department?
    public void averageOfDepartment(List<Student> slist) {
        slist.stream().collect(groupingBy(Student::getEngDepartment,averagingDouble(Student::getPerTillDate))).forEach((k,v)-> System.out.println(k+" Department has average percentage "+v));

    }

    //Get the details of youngest male student in the Electronic department?
    public void findYoungestStudent(List<Student> slist) {
        //Comparator.comparingInt(Student::getAge)
        Student youngestStudent=slist.stream().filter(student->student.engDepartment.equals("Electronic") && student.gender.equals("Male")).min(Comparator.comparingInt(Student::getAge)).orElseThrow(NoSuchElementException::new);
        System.out.println(youngestStudent.id+" "+youngestStudent.name+" "+youngestStudent.gender+" "+youngestStudent.engDepartment);
    }

    //How many male and female students are there in the computer science department?
    public void getCount(List<Student> slist) {
        slist.stream().filter(student->student.engDepartment.equals("Computer Science")).collect(groupingBy(Student::getGender)).forEach((k,v)-> System.out.println("No of "+k+" Students: "+v.size()));

    }
}