package com.learn;

import java.util.ArrayList;
import java.util.List;

public class StreamCoreExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		memberNames.add("Ani");
		memberNames.add("Emily");
		memberNames.add("Jeff");
		
		System.out.println("This is Filter");
		memberNames.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("This is to UPPER");
		
		memberNames.stream().filter((s) -> s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("This is to SORT");
		
		memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
		
                
	}

}
