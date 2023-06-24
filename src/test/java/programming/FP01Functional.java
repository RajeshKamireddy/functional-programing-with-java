package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
//		printAllNumbersInListFunctional(numbers);
		printEvenNumbersInListFunctional(numbers);
	}

	/*
	 * Method1 private static void print(int number) { System.out.println(number); }
	 * 
	 * private static void printAllNumbersInListFunctional(List<Integer> numbers) {
	 * numbers.stream() .forEach(FP01Functional::print); }
	 */

	// Method2- For this method void print(int number) method is not required
	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().forEach(System.out::println);
	}

	/*
	 * Below lines of code is not required while Using Lambda expression in below
	 * method private static boolean isEven(int number){ return number%2==0; }
	 */

	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream() //convert to stream
				// .filter(FP01Functional::isEven)//Filter - Only Alloww Even Numbers
				.filter(number -> number % 2 == 0)// Lambda Expression
				.forEach(System.out::println); //method reference
	}

}
