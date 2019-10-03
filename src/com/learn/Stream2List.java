package com.learn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lst =new ArrayList<Integer>();
		
		for(int i=80; i>=0;  i--)
		{
			lst.add(i);
		}
		
		Stream<Integer>  stm=lst.stream();
		List<Integer> evnlst=stm.filter(g -> g%2 ==1).collect(Collectors.toList());
		
		
		System.out.println(evnlst);

	}

}
