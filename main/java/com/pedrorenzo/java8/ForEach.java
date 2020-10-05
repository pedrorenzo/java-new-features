package com.pedrorenzo.java8;

import java.util.Arrays;
import java.util.List;

/**
 * Java 8 provide us the forEach method and using it, our code becomes smaller
 * and simpler!
 * 
 * @author pedrorenzo
 */
public class ForEach {

	public static void main(String args[]) {
		withoutForEach();
		withForEach();
	}

	private static void withoutForEach() {
		System.out.println("From withoutForEach");
		final List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		for (int i : intList) {
			System.out.println(i);
		}
	}

	private static void withForEach() {
		System.out.println("From withForEach");
		final List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		intList.forEach(System.out::println);
	}

}
