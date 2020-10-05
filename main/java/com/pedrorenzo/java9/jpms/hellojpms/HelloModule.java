package com.pedrorenzo.java9.jpms.hellojpms;

/**
 * Java Platform Module System has the main purpose of modularity. Before it,
 * Java application development was based on jars, but jars can have a big size
 * and with modules, we can make everything smaller, being able to use this
 * modules with IoT, for example!
 * 
 * We can also use JLink, that was also introduced in Java 9, and with it, we
 * can create our custom JRE to run our modules, making everything even smaller!
 * 
 * @author pedrorenzo
 */
public class HelloModule {

	public static void main(String[] args) {
		System.out.println("Hello Jlink");

	}

}
