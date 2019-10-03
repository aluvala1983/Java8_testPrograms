package com.learn;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream2Ary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> list = new ArrayList<Integer>();
        
		for(int i = 1; i< 10; i++){
            list.add(i);
        }
        
        Stream<Integer> stream = list.stream();
        
       /* Integer[] mainArray*/

	}

}
