package com.pedrorenzo.java12;

/**
 * We have two more new methods in String class: transform() and ident().
 * 
 * @author pedrorenzo
 */
public class StringHandling {

	public static void main(String[] args) {
		indentExample();
		transformExample();
	}

	private static void indentExample() {
		final var test = "This is a test \n Test is being tested";
		System.out.println(test.indent(60));
		System.out.println(test.indent(10));
	}

	private static void transformExample() {
		final var test2 = "Java".transform(str -> str + "This string will be part of the transformation");
		System.out.println(test2);
	}

}
