package com.pedrorenzo.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Java 8 provide us the Stream interface and using it, our code becomes smaller
 * and simpler! Stream represents a sequence of objects from a source, which
 * supports aggregate operations.
 * 
 * Stream has 3 parts:
 * 1) Source: Just 1. Converts Collection to Stream.
 * 2) Intermediate Operations: Could be more than 1. Returns a Stream object. filter(), limit(),
 * sorted(), map(), peek().
 * 3) Terminal Operation: Just 1. Collects data. collect(), count(), forEach(), reduce().
 * 
 * @author pedrorenzo
 */
public class Streams {

	public static void main(String args[]) {
		final List<Integer> javaVersionList = new ArrayList<>();
		javaVersionList.add(7);
		javaVersionList.add(8);
		javaVersionList.add(9);
		javaVersionList.add(10);
		javaVersionList.add(11);
		javaVersionList.add(12);

		beforeJava8(javaVersionList);
		fromJava8(javaVersionList);

	}

	private static void beforeJava8(final List<Integer> javaVersionList) {
		final List<Integer> evenList = new ArrayList<>();
		for (Integer javaVersion : javaVersionList) {
			if (javaVersion % 2 == 0) {
				evenList.add(javaVersion);
			}
		}
		System.out.println("beforeJava8 Java version even list: " + evenList);
	}

	private static void fromJava8(final List<Integer> javaVersionList) {
		final List<Integer> javaVersions = javaVersionList.stream().filter(javaVersion -> javaVersion % 2 == 0)
				.collect(Collectors.toList());
		System.out.println("fromJava8 Java version even list: " + javaVersions);
	}

}
