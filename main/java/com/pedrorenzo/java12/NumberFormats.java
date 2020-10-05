package com.pedrorenzo.java12;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * We have now some different ways to format numbers.
 * 
 * @author pedrorenzo
 */
public class NumberFormats {
	
	public static void main(String[] args) {
		display1K();
		display1KLong();
		display1M();
		display1MLong();
	}

	private static void display1K() {
		final NumberFormat fmt = NumberFormat.getCompactNumberInstance();
		final String result = fmt.format(1000);
		System.out.println("From display1K 1000: " + result); // Output: 1k
	}

	private static void display1KLong() {
		final NumberFormat fmt = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
		final String result = fmt.format(1000);
		System.out.println("From display1KLong 1000: " + result); // Output: 1 thousand
	}

	private static void display1M() {
		final NumberFormat fmt = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
		final String result = fmt.format(1000000);
		System.out.println("From display1M 1000000: " + result); // Output: 1M
	}

	private static void display1MLong() {
		final NumberFormat fmt = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
		final String result = fmt.format(1000000);
		System.out.println("From display1MLong 1000000: " + result); // Output: 1 million
	}
	
}
