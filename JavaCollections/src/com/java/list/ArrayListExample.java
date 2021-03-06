package com.java.list;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Ram
 *
 */
public class ArrayListExample {

	
	public static void main(String[] args) {
	}
	
	/**
	 * The method is to sort a list having more than 1 same elements
	 * {@value=sortedList}
	 * {@link Parameter}
	 *
	 */private static void sortListCOntainingSameElements(){
		List<Integer> list =new ArrayList<>();
		list.add(2);
		list.add(7);
		list.add(3);
		list.add(70);
		list.add(1);
		list.add(1);
		
		list.forEach(num->System.out.print(num+" "));
		Collections.sort(list);
		System.out.println("After sorting :: ");
		list.forEach(num->System.out.print(num+" "));

	}
}
