package com.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ChainConsumers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> mystrlist=Arrays.asList("0ne","Two","Three","Four","Five","Six","Seven");
		
		List<String> res=new ArrayList<String>();

		Consumer<String> sc1 = System.out::println;
		
		Consumer<String> sc2 = res::add;
		
		
		
		mystrlist.forEach(sc1.andThen(sc2));
		
		System.out.println("Size " + res.size());
		
		
		
	}

}
