package com.app.java8.parameters.functionalInterfacers;

import com.app.java8.parameters.data.Student;
import com.app.java8.parameters.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> c1 = (student) -> System.out.println(student);
    static Consumer<Student> c2 = (student) -> System.out.print(student.getName());
    static Consumer<Student> c3 = (student) -> System.out.println(student.getActivities());

    public static void getAllStudents() {
        System.out.println("getAllStudents");
        System.out.println(" ");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(c1);
    }
    public static void printNameAndActivities() {
        System.out.println(" ");
        System.out.println("printNameAndActivities");
        System.out.println(" ");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(c2.andThen(c3));
    }
    public static void printNameAndActivitiesUsingCondition(){
        System.out.println(" ");
        System.out.println("printNameAndActivitiesUsingCondition");
        System.out.println("  ");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(( (student)->
        {
            if(student.getGradeLevel()>=3 && student.getGpa()>=3.9){
                c2.andThen(c3).accept(student);
            }
        }));
    }
    public static void main(String[] args) {

//        Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());
//        consumer.accept("mahesh");
        getAllStudents();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }
}
