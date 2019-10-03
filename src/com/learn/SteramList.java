package com.learn;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;


public class SteramList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> lst=new ArrayList<Integer>();
		
		for(int i=300; i>=0;  i =i-5)
		{
			lst.add(i);
		}
		
		Stream<Integer> st=lst.stream();
		System.out.println("Stearm Hero start");
		st.forEach(p -> System.out.println("The number is " + p));
		System.out.println("Stearm Hero Ends");
		
	}

}
