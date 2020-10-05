package com.pedrorenzo.java8;

import java.util.function.Function;

/**
 * This is a variation of Function, using the default method andThen of this
 * interface. With that, we can execute a function, after the first one be
 * executed. And we use the value returned from the first, on the second. 
 * 
 * @author pedrorenzo
 */
public class FunctionsCompose {

	public static void main(String args[]) {
		final Function<String, String> function1 = s -> s.toUpperCase();
		final Function<String, String> function2 = s -> s + " World";

		System.out.println("Output of function1 : " + function1.apply("Hello"));
		System.out.println("andThen Output : " + function1.andThen(function2).apply("Hello"));
	}

}
