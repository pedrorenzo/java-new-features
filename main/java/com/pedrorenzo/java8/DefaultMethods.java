package com.pedrorenzo.java8;

/**
 * Imagine that we have an interface that is used a lot and we want to insert a
 * new method in it. In doing so, everyone who uses this interface would have to
 * implement it as well. The default method allows an interface to have a
 * default implementation for a method, solving this problem. If any class that
 * implements that interface wants to implement it, it can do that without
 * problems :).
 * Another good thing is that we can avoid redundant code in classes
 * that implements this interface.
 * 
 * @author pedrorenzo
 */
public class DefaultMethods {
	public static void main(String[] args) {
		final WillReuseCode1 willReuseCode1 = new WillReuseCode1();
		final WillReuseCode2 willReuseCode2 = new WillReuseCode2();
		
		willReuseCode1.sayHelloToTheWorld();
		willReuseCode2.sayHelloToTheWorld();
		InterfaceWithDefaultMethod.utilityMethod();
	}
}

interface InterfaceWithDefaultMethod {
	default void sayHelloToTheWorld() {
		System.out.println("Hello World :)");
	}
	
	// We can have static methdos in interfaces as well. They are used as utility
	// methods.
	static public void utilityMethod() {
		System.out.println("Anyone called this utility method?");
	}
}

/**
 * This class can use the already implemented method from InterfaceWithDefaultMethod.
 * 
 * @author pedrorenzo
 */
class WillReuseCode1 implements InterfaceWithDefaultMethod {
//	public void sayHelloToTheWorld() {
//		System.out.println("Hello World :)");
//	}
}

/**
 * This class can use the already implemented method from InterfaceWithDefaultMethod.
 * 
 * @author pedrorenzo
 */
class WillReuseCode2 implements InterfaceWithDefaultMethod {
//	public void sayHelloToTheWorld() {
//		System.out.println("Hello World :)");
//	}
}

