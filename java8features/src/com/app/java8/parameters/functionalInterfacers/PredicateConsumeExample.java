package com.app.java8.parameters.functionalInterfacers;

import com.app.java8.parameters.data.Student;
import com.app.java8.parameters.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateConsumeExample {

    static Predicate<Student> p = (student -> student.getGradeLevel() >= 3);
    static Predicate<Student> p1 = (student -> student.getGpa() >= 3.9);

    static BiPredicate<Integer,Double> biPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;
    static BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
        System.out.println(name + " " + activities);
    };
    static Consumer<Student> studentConsumer = (student -> {
        if (biPredicate.test(student.getGradeLevel(), student.getGpa())) {
            biConsumer.accept(student.getName(), student.getActivities());
        }
    });

    public static void printNameAndActivities() {
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {
    printNameAndActivities();
    }
}
