import java.util.Scanner;

public class Calculator {
	public static double add(double no1, double no2) {
		return no1 + no2;
	}

	public static double substract(double no1, double no2) {
		return no1 - no2;
	}

	public static double multiply(double no1, double no2) {
		return no1 * no2;
	}

	public static double divide(double no1, double no2) {
		return no1 / no2;
	}

	public static void getFunction(String input) {
		if (input.contains("+")) {
			String[] a = input.split("\\+");

			double d1 = Double.parseDouble(a[0]);
			double d2 = Double.parseDouble(a[1]);
			System.out.println("add is executed");
			double ans = Calculator.add(d1, d2);
			System.out.println("'" + d1 + "'" + "+" + "'" + d2 + "' " + "= " + ans);

		} else {
			if (input.contains("-")) {

				String[] a = input.split("\\-");

				double d1 = Double.parseDouble(a[0]);
				double d2 = Double.parseDouble(a[1]);
				System.out.println("substract is executed");
				double ans = Calculator.substract(d1, d2);
				System.out.println("output = " + ans);

			}
		
			else {
				if (input.contains("*")) {

					String[] a = input.split("\\*");

					double d1 = Double.parseDouble(a[0]);
					double d2 = Double.parseDouble(a[1]);
					System.out.println("Multiply is executed");
					double ans = Calculator.multiply(d1, d2);
					System.out.println("output = " + ans);

				}

				else {
					if (input.contains("/")) {

						String[] a = input.split("\\/");

						double d1 = Double.parseDouble(a[0]);
						double d2 = Double.parseDouble(a[1]);
						System.out.println("Dived is executed");
						double ans = Calculator.substract(d1, d2);
						System.out.println("output = " + ans);

					}
					

				}
				
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input");
		String s = sc.next();
		Calculator.getFunction(s);
	}
}