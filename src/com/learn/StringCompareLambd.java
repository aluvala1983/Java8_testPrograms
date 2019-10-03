package com.learn;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringCompareLambd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Comparator<String> comp=new Comparator<String>() {
//		
//		@Override
//		public int compare(String s1,String s2)
//		{
//			return Integer.compare(s1.length(), s2.length());
//		}
//
//		};
		
		Comparator<String> comp = ( s1, s2) -> Integer.compare(s1.length(), s2.length());
		
		List<String> lst=Arrays.asList("****","***","This","*","dsbklb","gfjksw");
		Collections.sort(lst,comp);
		
		
		for (String l:lst) {
			System.out.println(l);
		}
		
	}

}
