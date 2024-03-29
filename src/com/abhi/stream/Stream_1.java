package com.abhi.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_1 {

	public static void main(String[] args) {
		//create a list and filter all even number
		
		List<Integer> list1 =List.of(22,33,44,55);
		List<Integer> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		
		List<Integer> list3 =  Arrays.asList(1,2,3,4);

		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
		//list1
		//without stream
		List<Integer> listEven = new ArrayList<>();
		
		for(Integer i : list1) {
			if(i%2==0) {
				listEven.add(i);
			}
		}
		
		System.out.println(listEven);
		
		//with stream
		Stream<Integer> strm = list1.stream();
//		List<Integer> newlist = strm.filter(i -> i%2 == 0).collect(Collectors.toList());
//		System.out.println(newlist);
		
		List<Integer> newlist = list1.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println(newlist);
		
		List<Integer> listGreaterThan50 = list1.stream().filter(i -> i>30 ).collect(Collectors.toList());
		System.out.println(listGreaterThan50);
		

	}

}
