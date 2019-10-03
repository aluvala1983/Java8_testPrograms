package com.learn;

import java.util.Date;
import java.util.stream.Stream;

public class StreamGenDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Date> st=Stream.generate( () -> {return new Date();});
		
		st.forEach(p -> System.out.println(p));
		

	}
	
}
