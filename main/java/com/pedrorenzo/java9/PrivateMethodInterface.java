package com.pedrorenzo.java9;

import java.util.Random;

/**
 * By default, all methods in an interface are public. Why private methods in
 * interface? For common responsibilities between methods!
 * 
 * @author pedrorenzo
 */
public interface PrivateMethodInterface {

	static void displayRandom2() {
		System.out.println("From displayRandom2(): " + generateRandomNumber());
	}

	static void displayRandom1() {
		System.out.println("From displayRandom1(): " + generateRandomNumber());
	}

	private static int generateRandomNumber() {
		return new Random().nextInt();

	}

}
