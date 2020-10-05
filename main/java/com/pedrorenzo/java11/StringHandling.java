package com.pedrorenzo.java11;

import java.util.stream.Stream;

/**
 * We have now new methods inside the String class and they can help us to
 * simplify a lot of work! The new methdos are: repeat(n), isBlank(), lines(),
 * strip(), stripLeading() and stripTrailing().
 * 
 * @author pedrorenzo
 */
public class StringHandling {

	public static void main(String[] args) {
		// isBlank()
		beforeJava11IsBlank();
		fromJava11IsBlank();

		// lines()
		beforeJava11Lines();
		fromJava11Lines();

		// repeat()
		beforeJava11Repeat();
		fromJava11Repeat();

		// strip()
		beforeJava11Strip();
		fromJava11Strip();
	}

	private static void beforeJava11IsBlank() {
		System.out.println("Is Blank - Before Java 11: ");
		final String str = "";

		// Option#1
		if (str.length() == 0) {
			System.out.println("String is blank");
		} else {
			System.out.println("String is not blank");
		}
		// Option #2
		if (str.equals("")) {
			System.out.println("String is blank");
		} else {
			System.out.println("String is not blank");
		}
		// Option #3
		if (str.isEmpty()) {
			System.out.println("String is empty");
		} else {
			System.out.println("String is not empty");
		}
	}

	private static void fromJava11IsBlank() {
		System.out.println("Is Blank - From Java 11: ");
		final String str = "";

		if (str.isBlank()) {
			System.out.println("String is blank");
		} else {
			System.out.println("String is not blank");
		}
	}

	private static void beforeJava11Lines() {
		System.out.println("Lines - Before Java 11: ");
		final String str = "Java11\nJava10\nJava9\nJava8";
		final String lines[] = str.split("\\n");
		for (String s : lines) {
			System.out.println(s);
		}

	}

	private static void fromJava11Lines() {
		System.out.println("Lines - From Java 11");
		final String str = "Java11\nJava10\nJava9\nJava8";
		System.out.println(str.lines());

		final Stream<String> strings = str.lines();
		strings.forEach(System.out::println);
	}

	private static void beforeJava11Repeat() {
		System.out.println("Repeat - Before Java 11: ");
		final String javaVersion = "Java11";
		for (int i = 0; i < 100; i++) {
			System.out.println(javaVersion);

		}
	}

	private static void fromJava11Repeat() {
		System.out.println("Repeat - From Java 11: ");
		final String javaVersion = "Java11\n";
		System.out.println(javaVersion.repeat(100));
	}

	private static void beforeJava11Strip() {
		System.out.println("Strip - Before Java 11: ");

		final String javaVersion = " Java 11 ";
		// Remove spaces from both sides.
		final String strTrim = javaVersion.trim();

		System.out.println("Original String: " + javaVersion + "--");
		System.out.println("Trimmed String: " + strTrim + "--");

		// We do not have a method to remove spaces from left or right side! We have to
		// do it manually:
		System.out.println("Original String left trimmed: " + javaVersion.replaceAll("^\\s+", "") + "--");
		System.out.println("Original String right trimmed: " + javaVersion.replaceAll("\\s+$", "") + "--");
	}

	private static void fromJava11Strip() {
		System.out.println("Strip - From Java 11: ");
		final String javaVersion = " Java 11 ";
		System.out.println("Original String: " + javaVersion + "--");

		// Remove spaces from both sides.
		final String strStrip = javaVersion.strip();
		System.out.println("Stripped String: " + strStrip + "--");

		// Remove spaces from right side.
		final String strStripTrailing = javaVersion.stripTrailing();
		System.out.println("Removed Trailing String: " + strStripTrailing + "--");

		// Remove spaces from left side.
		final String strStripLeading = javaVersion.stripLeading();
		System.out.println("Removed Leading String: " + strStripLeading + "--");
	}

}
