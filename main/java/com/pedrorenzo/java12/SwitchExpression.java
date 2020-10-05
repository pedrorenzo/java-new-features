package com.pedrorenzo.java12;

/**
 * The switch case syntax is very simple now with Java 12! We do not need to use
 * break!
 * 
 * @author pedrorenzo
 */
public class SwitchExpression {

	// We could also use an enum!
//	enum Month {
//	    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
//	};
	
	final static String JANUARY = "JANUARY";
	final static String FEBRUARY = "FEBRUARY";
	final static String MARCH = "MARCH";
	final static String APRIL = "APRIL";
	final static String MAY = "MAY";
	final static String JUNE = "JUNE";
	final static String JULY = "JULY";
	final static String AUGUST = "AUGUST";
	final static String SEPTEMBER = "SEPTEMBER";
	final static String OCTOBER = "OCTOBER";
	final static String NOVEMBER = "NOVEMBER";
	final static String DECEMBER = "DECEMBER";

	public static void main(String args[]) {
		final SwitchExpression switchExpression = new SwitchExpression();
		switchExpression.beforeJava12(FEBRUARY);
		switchExpression.fromJava12(FEBRUARY);
	}

	// public void beforeJava12(final Month month) { --> If we used enum.
	public void beforeJava12(final String month) {
		String season = "";
		switch (month) {
		case JANUARY:
			season = "Winter";
			break;
		case FEBRUARY:
		case MARCH:
		case APRIL:
		case MAY:
			season = "Summer";
			break;
		case JUNE:
		case JULY:
		case AUGUST:
		case SEPTEMBER:
			season = "Rainy";
			break;
		case OCTOBER:
		case NOVEMBER:
		case DECEMBER:
			season = "winter";
			break;

		}
		System.out.println("Before Java 12 Month: " + month + " Season: " + season);
	}

	public void fromJava12(final String month) {
		String season = "";
		switch (month) {
		case JANUARY -> season = "Winter";
		case FEBRUARY, MARCH, APRIL, MAY -> season = "Summer";
		case JUNE, JULY, AUGUST, SEPTEMBER -> season = "Rainy";
		case OCTOBER, NOVEMBER, DECEMBER -> season = "Winter";
		}

		// We could also do it: Instead of have the code season = ... in each case, we could directly
		// assign the result of the switch case in this variable!
//		String season = switch (month) {
//		case JANUARY -> "Winter";
//		case FEBRUARY, MARCH, APRIL, MAY -> "Summer";
//		case JUNE, JULY, AUGUST, SEPTEMBER -> "Rainy";
//		case OCTOBER, NOVEMBER, DECEMBER -> "Winter";
//		}

		System.out.println("From Java 12 Month: " + month + " Season: " + season);
	}

}
