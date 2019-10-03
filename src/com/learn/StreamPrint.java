package com.learn;

import java.util.stream.*;

public class StreamPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Integer> st=Stream.of(new Integer[] {1,2,4,5,7,8,34,55,62,4,77,8,38,29,2,-2,4,6,7,4,2});
		System.out.println("Here starts the Stream Print");
		st.forEach(p -> System.out.println(p));
		System.out.println("Here Ends the Stream Print");

	}

}
