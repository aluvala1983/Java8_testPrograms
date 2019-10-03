package com.learn;

import java.util.Arrays;
import java.util.List;

public class Add3Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lst=Arrays.asList(1,2,4,6,7,8,5,3);
		
		Integer sumval=lst.stream().reduce(0, Integer::sum);
		
		System.out.println(sumval);

	}

}
