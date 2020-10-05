package com.pedrorenzo.java9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * We have now in Stream 3 new methods: takeWhile, dropWhile and ofNullable.
 * 
 * @author pedrorenzo
 */
public class StreamEnhancements {

	static List<Integer> marksList = Arrays.asList(50, 60, 80, 90, 40);

	public static void main(String args[]) {
		takeWhile();
		dropWhile();
		ofNullable();
	}

	/**
	 * It stops when the condition is false.
	 */
	public static void takeWhile() {
		final List<Integer> tempList = marksList.stream().takeWhile(i -> i < 80).collect(Collectors.toList());
		System.out.println("takeWhile: " + tempList);

	}

	/**
	 * It starts when the condition is false.
	 */
	public static void dropWhile() {
		final List<Integer> tempList = marksList.stream().dropWhile(i -> i < 80).collect(Collectors.toList());
		System.out.println("dropWhile: " + tempList);

	}

	/**
	 * It helps to avoid null pointer exception, returning an empty list when the
	 * list is null.
	 */
	public static void ofNullable() {
		final List<Integer> nullList = null;
		final List<Integer> marksList = Arrays.asList(50, 60, 80, 90, 40);
		final List tempList = Stream.ofNullable(nullList).collect(Collectors.toList());
		final List tempList2 = Stream.ofNullable(marksList).collect(Collectors.toList());
		System.out.println("ofNullable: " + tempList);
		System.out.println("ofNullable tempList2: " + tempList2);
	}

}
