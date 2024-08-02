package com.app.java8.parameters.functionalInterfacers;

import com.app.java8.parameters.data.Student;
import com.app.java8.parameters.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    static Predicate<Student> p1 = (student) -> student.getGradeLevel()>=3;
    static Predicate<Student> p2 = (student) -> student.getGpa()>=3.9;

    public static void printGradeLevelStudent(){
        System.out.println("printGradeLevelStudent");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach((student -> {
            if (p1.test(student)) {
                System.out.println(student);
            }
        }));
    }

    public static void printGpaLevel(){
        System.out.println("printGpaLevel");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach((student -> {
            if (p2.test(student)) {
                System.out.println(student);
            }
        }));
    }

    public static void printBothGpaAndGradeLevel(){
        System.out.println("printBothGpaAndGradeLevel");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach((student -> {
            if (p1.negate().test(student)) {
                System.out.println(student);
            }else {
                System.out.println(student);
            }
        }));
    }
    public static void main(String[] args) {
     printGradeLevelStudent();
     printGpaLevel();
     printBothGpaAndGradeLevel();
    }
}
