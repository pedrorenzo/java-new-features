package com.pedrorenzo.java10;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.HashMap;

/**
 * Reduces the verbosity of the language and helps to infer data type
 * implicitly.
 * 
 * @author pedrorenzo
 */
public class TypeInferenceWithVar {

	public static void main(String[] args) throws IOException {

		// Before Java 10.
		final String firstName = "Pedro";
		final String lastName = "Vicentin";
		final Date dateOfBirth = new Date();
		final int salary = 50;
		final URL url = new URL("http://github.com/");
		final URLConnection urlConnection = url.openConnection();

		// From Java 10.
		final var firstName2 = "Pedro";
		final var lastName2 = "Vicentin";
		final var dateOfBirth2 = new Date();
		final var salary2 = 50000;
		final var url2 = new URL("http://github.com/");
		final var urlConnection2 = url.openConnection();

		// Compiler infers based on the values and perform the required operation.
		System.out.println(salary2 + salary2);
		System.out.println(firstName2 + lastName2);

		// Before Java 10.
		final HashMap<Integer, String> studentMap = new HashMap<Integer, String>();

		// From Java 10.
		final var studentMap1 = new HashMap<>();

		// Before Java 10.
		final String stringWithNoInitiazation;
		final String stringWithNull = null;

		// We must initialize our variables if we declare it "var".
		// var stringWithNoInitiazation1;
	}

}
