package com.pedrorenzo.java8;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * We also have the option of using streams in parallel, which brings a better
 * performance to the application. It is worth remembering that we must be
 * concerned with the competition between threads in this scenario.
 * 
 * @author pedrorenzo
 */
public class ParalelStreams {

	private static void sequentialStream() {
		final List<Integer> intList = new ArrayList<>();
		for (int i = 0; i < 70000; i++) {
			intList.add(i);
		}
		final Predicate<Integer> evenPredicate = (a -> a % 2 == 0);
		final List<Integer> evenList = intList.stream().filter(evenPredicate).collect(Collectors.toList());
	}

	private static void paralelStream() {
		final List<Integer> intList = new ArrayList<>();
		for (int i = 0; i < 70000; i++) {
			intList.add(i);
		}
		final Predicate<Integer> evenPredicate = (a -> a % 2 == 0);
		final List<Integer> evenList = intList.parallelStream().filter(evenPredicate).collect(Collectors.toList());
	}

	public static void main(String args[]) {
		final Instant startTime = Instant.now();
		// long startTimeBeforeJava8 = System.currentTimeMillis();
		sequentialStream();
		final Instant endTime = Instant.now();
		final Duration duration = Duration.between(startTime, endTime);
		System.out.println("Sequential Stream Duration: " + duration.toMillis());

		final Instant paralelStartTime = Instant.now();

		paralelStream();
		final Instant paralelEndTime = Instant.now();
		final Duration paralelDuration = Duration.between(paralelStartTime, paralelEndTime);
		System.out.println("Paralel Stream Duration: " + paralelDuration.toMillis());
	}

}
