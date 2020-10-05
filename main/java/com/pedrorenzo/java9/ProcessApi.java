package com.pedrorenzo.java9;

import java.util.Optional;

/**
 * Java was not a good option to work with communicating to the processor/OS. But it changed!
 * 
 * For this example, get an pid of your OS and substitute it on the pid variable.
 * 
 * @author pedrorenzo
 */
public class ProcessApi {

	public static void main(String[] args) {
		final int pid = 29156; // Subistitute here!
		final int pid2 = 123456789; // Dummy pid.

		final Optional<ProcessHandle> processHandle1 = ProcessHandle.of(pid);
		final Optional<ProcessHandle> processHandle2 = ProcessHandle.of(pid2);
		System.out.println("pid " + pid + " is present? " + processHandle1.isPresent());
		System.out.println("pid " + pid2 + " is present? " + processHandle2.isPresent());

		final ProcessHandle processHandle = ProcessHandle.current();
		System.out.println("Current process details: " + processHandle.info());
	}

}
