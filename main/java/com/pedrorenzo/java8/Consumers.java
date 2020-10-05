package com.pedrorenzo.java8;

import java.util.function.Consumer;

/**
 * Consumer is very similar from Predicate, but it has no output.
 * 
 * @author pedrorenzo
 */
public class Consumers {

	public static void main(String args[]) {
		beforeJava8();
		fromJava8();

	}

	private static void beforeJava8() {
		dispalyInUpperCase("Hello world!");
	}

	private static void dispalyInUpperCase(final String str) {
		System.out.println(str.toUpperCase());

	}

	private static void fromJava8() {
		final Consumer<String> consumer = str -> System.out.println(str.toUpperCase());
		consumer.accept("Hello world!");
	}

}
