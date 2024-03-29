package com.abhi.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {

	public static void main(String[] args) {

		//filter (predicate)
			//boolean value function
			//e->{ return true/false }
		
		
		
		//map (function)
			//each element operation
		
		
		List<String> names = List.of("Aman","Abhi" ,"Durgesh", "Mayank", "Zaheer");
		List<String> newNames = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
		System.out.println(newNames);
		
		List<Integer> numbers = List.of(2,3,4,5,6,7);
		List<Integer> newNumbers = numbers.stream().map(i -> i*i).collect(Collectors.toList());
		System.out.println(newNumbers);
		
//		names.stream().forEach(e -> System.out.println(e));
		names.stream().forEach(System.out::println);
		
		
		numbers.stream().sorted().forEach(System.out::println);
		
		Integer int1 = numbers.stream().min((x,y) -> x.compareTo(y)).get();
		System.out.println("Min- "+int1);
		
		Integer int2 = numbers.stream().max((x,y) -> x.compareTo(y)).get();
		System.out.println("Max- "+int2);
	}

}
