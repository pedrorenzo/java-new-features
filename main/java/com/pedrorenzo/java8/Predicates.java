package com.pedrorenzo.java8;

import java.util.function.Predicate;

/**
 * Predicate simplify our code when we want to do validations and here I did a
 * simple example to show how our code get smaller using it.
 * 
 * @author pedrorenzo
 */
public class Predicates {

	public static void main(String args[]) {
		withoutPredicate();
		withPredicate();
	}

	private static void withoutPredicate() {
		System.out.println("From withoutPredicate");
		final Integer transactionAmount = 20000;
		if (isGreater(transactionAmount)) {
			System.out.println("Transaction Amount can't be greater than 10000");
		} else {
			System.out.println("Transaction Amount is less than 10000, please proceed");
		}

	}

	public static Boolean isGreater(final Integer i) {
		if (i > 10000) {
			return true;
		} else {
			return false;
		}
	}

	private static void withPredicate() {
		System.out.println("From withPredicate!");
		final Integer amount = 20000;
		final Predicate<Integer> p = transactionAmount -> transactionAmount > 10000;
		if (p.test(amount)) {
			System.out.println("Transaction Amount can't be greater than 10000");
		} else {
			System.out.println("Transaction Amount is less than 10000, please proceed");
		}

	}

}
