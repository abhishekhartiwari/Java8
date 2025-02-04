package com.abhi.Supplier;

import java.util.function.Supplier;

public class MySupplier {
    
    public static void main(String[] args) {
    
        Supplier<String> supplier = () -> "Hello, Supplier!";
        System.out.println(supplier.get());
    }
    
    
}
