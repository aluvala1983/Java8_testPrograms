package com.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class StreamExamp1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> lst=new ArrayList<>(Arrays.asList(1,2,3,34,5,4));
		
		Consumer<Integer> action=System.out::println;
		
		lst.stream().filter(n -> n%2  == 0).forEach(action);

	}

}
