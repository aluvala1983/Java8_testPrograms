package com.learn.streamapi;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstPredicateExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<String> strm=Stream.of("0ne","Two","Three","Four","Five","Six","Seven");
		
		Predicate<String> p = s-> s.length() >3;
		
		Predicate<String> p2= Predicate.isEqual("Two");
		
		Predicate<String> p3= Predicate.isEqual("Five");
		
		
		
		strm
			.filter(p2.or(p3))
			.forEach(System.out::println);
	}

}
