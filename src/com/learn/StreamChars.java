package com.learn;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntStream strm= "12345gdldfjklfasklf_363128974692".chars();
		
		strm.forEach(p -> System.out.print(" " + p));
		System.out.println();
		System.out.println(" Here comes the chars");
		
		Stream<String> st=Stream.of("a$k$d$M".split("\\$"));
		st.forEach(k -> System.out.println(k));
		
		//Stream<String> sk=Stream.Builder<String>();
 
	}

}
