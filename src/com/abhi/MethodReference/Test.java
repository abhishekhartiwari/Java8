package com.abhi.MethodReference;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void print(String s){
        System.out.println(s);
    }

    public void print2(String s){
        System.out.println(s);
    }
    
    public static void main(String[] args) {
        List<String> students  = Arrays.asList("Alice", "Bob", "Charlie");
        // students.forEach(x -> System.out.println(x));
        //students.forEach(Test::print);
        Test test = new Test();
        students.forEach(test::print2);

    }
}
