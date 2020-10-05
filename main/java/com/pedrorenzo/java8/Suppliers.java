package com.pedrorenzo.java8;

import java.util.function.Supplier;

/**
 * Supplier is very similar from Predicate, but it takes no input.
 * 
 * @author pedrorenzo
 */
public class Suppliers {

	public static void main(String args[]) {
		beforeJava8();
		fromJava8();

	}

	private static void beforeJava8() {
		final double eurRate = getEURRate();
		System.out.println("beforeJava8 :EURO rate is " + eurRate);
	}

	public static double getEURRate() {
		final double eurRate = 0.85;
		return eurRate;

	}

	private static void fromJava8() {
		final double eurRate = 0.85;
		final Supplier<Double> supplier = () -> eurRate;
		System.out.println("fromJava8 :EUR rate is " + supplier.get());

	}

}
