package com.pedrorenzo.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream map is used when we want to modify all the elemnts of a Collection,
 * for example. Stream flatMap is the same idea, but, while map is used for one
 * to one elements, flatMap is one to many elements.
 * 
 * @author pedrorenzo
 */
public class StreamMapAndFlatMap {

	public static void main(String args[]) {
		final List<String> javaVersionList = new ArrayList<>();
		javaVersionList.add("Java 7");
		javaVersionList.add("Java 8");
		javaVersionList.add("Java 9");
		javaVersionList.add("Java 10");
		javaVersionList.add("Java 11");
		javaVersionList.add("Java 12");

		System.out.println("Original Java version list: " + javaVersionList);

		final List<String> javaMapList = javaVersionList.stream().map(javaVersion -> javaVersion.toUpperCase())
				.collect(Collectors.toList());
		System.out.println("Modified Java version list with map: " + javaMapList);

		final List<String> javaFlatMapList = javaVersionList.stream().flatMap(javaVersion -> Stream
				.of(javaVersion.toUpperCase(), javaVersion.toLowerCase(), javaVersion.concat(" :)")))
				.collect(Collectors.toList());
		System.out.println("Modified Java version list with flatMap: " + javaFlatMapList);
	}

}
