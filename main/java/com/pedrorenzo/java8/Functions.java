package com.pedrorenzo.java8;

import java.util.function.Function;

/**
 * Function simplify our code and here I did a simple example to show how our
 * code get smaller using it.
 * 
 * @author pedrorenzo
 */
public class Functions {

	public static void main(String args[]) {
		beforeJava8();
		fromJava8();
	}

	private static void beforeJava8() {
		final Integer usd = 10;
		final Double eurValue = convertUsdToEur(usd);
		System.out.println("From beforeJava8 " + usd + " USD = " + eurValue + " EUR");

	}

	private static Double convertUsdToEur(final Integer usd) {
		final Double eurRate = 0.85;
		return usd * eurRate;
	}

	/**
	 * You can see that we do not need to create any new method :)
	 */
	private static void fromJava8() {
		final Double eurRate = 0.85;
		final Function<Integer, Double> function = usd -> usd * eurRate;
		System.out.println("From fromJava8 " + 10 + " USD = " + function.apply(10) + " EUR");
	}

}
