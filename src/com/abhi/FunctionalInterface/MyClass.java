package com.abhi.FunctionalInterface;

public class MyClass {
    public static void main(String[] args) {
        System.out.println("Hello World !!");


        ThirdClass t = () -> System.out.println("Hiiiii !!");   

        System.out.println(t);
    }
}
interface SecondClass{
    void sayHello();
    void sayBye();
}

@FunctionalInterface
interface ThirdClass{
    void sayHi();
}

