package com.app.java8.parameters.functionalInterfacers;

import com.app.java8.parameters.data.Student;
import com.app.java8.parameters.data.StudentDataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void printNameAndActivities() {
        List<Student> students = StudentDataBase.getAllStudents();
        BiConsumer<String, List<String>> c = (name, activities) -> {
            System.out.println(name + " " + activities);
        };
        students.forEach(student -> c.accept(student.getName(), student.getActivities()));
    }

    public static void main(String[] args) {
        printNameAndActivities();

        BiConsumer<Integer, Integer> sum = (a, b) -> System.out.println(a+b);

        BiConsumer<Integer, Integer> multiply = (a, b) -> System.out.println(a*b);

        sum.andThen(multiply).accept(10, 20);

    }
}
