package com.abhi.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamObject {
	public static void main(String[] args) {
		
		//Stream API - collection process
		//Collection group of object
		
		//1- blank
		Stream<Object> emptyStream = Stream.empty();
		emptyStream.forEach(e -> System.out.println(e));
		
		//2- array, object, collection
		String names[] = {"Abhishek","Akhi","Harshit"};
		Stream<String> stream1 = Stream.of(names);
		stream1.forEach(e -> System.out.println(e));
		
		//3
		Stream<Object> streamBuilder = Stream.builder().build();
		
		//4 List, Set
		List<Integer> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		
		Stream<Integer> stream2 = list2.stream();
		stream2.forEach(e -> System.out.println(e));
		
		
		//5 
		
	}

}
	