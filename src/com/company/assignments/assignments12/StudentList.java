package com.company.assignments.assignments12;

import java.util.*;

public class StudentList {

    List<Student> list=new ArrayList<>();

    public static void main(String[] args) {

        StudentList studentList = new StudentList();
        //studentList.list.add();
        studentList.list.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        studentList.list.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentList.list.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentList.list.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        studentList.list.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentList.list.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        studentList.list.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        studentList.list.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        studentList.list.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        studentList.list.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        studentList.list.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentList.list.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentList.list.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentList.list.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentList.list.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        studentList.list.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));
        Streams stream = new Streams();
        System.out.println("Print the name of all departments in the college?");
        stream.printDepartments(studentList.list);
        System.out.println("===========================");
        System.out.println("Get the names of all students who have enrolled after 2018?");
        stream.getMaleStudentOfCSE(studentList.list);
        System.out.println("===========================");
        System.out.println("Get the details of all male student in the computer sci department?");
        stream.getNames(studentList.list);
        System.out.println("===========================");
        System.out.println("How many male and female student are there ?");
        stream.countMaleFemale(studentList.list);
        System.out.println("===========================");
        System.out.println(".What is the average age of male and female students?");
        stream.averageAgeOfMaleFemale(studentList.list);
        System.out.println("===========================");
        System.out.println("Get the details of highest student having highest percentage ?");
        stream.HighestPercentage(studentList.list);
        System.out.println("===========================");
        System.out.println("Count the number of students in each department?");
        stream.countStudent(studentList.list);
        System.out.println("===========================");
        System.out.println("What is the average percentage achieved in each department?");
        stream.averageOfDepartment(studentList.list);
        System.out.println("===========================");
        System.out.println("Get the details of youngest male student in the Electronic department?");
        stream.findYoungestStudent(studentList.list);
        System.out.println("===========================");
        System.out.println("How many male and female students are there in the computer science department?");
        stream.getCount(studentList.list);
    }
}