package programming;

import java.util.List;

public class FP01Exercises {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernates");
	
	//----------------Filter and Stream Exercises--------------------
		printOddNumbersInListFunctional(numbers);
		printAllCoursesInListFunctional(courses);
		printCoursesContainsSpringWordInListFunctional(courses);
		printCourseshas4LettersInListFunctional(courses);
		
	//--------------------Mapping Exercises--------------------
		printSquaresOfEvenNumbers(numbers);
		printCubesOfOddNumbers(numbers);
		printNumberOfCharactersInEachCourseName(courses);
		
	}


	private static void printCourseshas4LettersInListFunctional(List<String> courses) {
		System.out.println("-------------------Print courses whose name has atleast 4 letters---------------------------");
		courses.stream()
		.filter(course -> course.length()>=4)// Lambda Expression
		.forEach(System.out::println);
		
	}


	private static void printCoursesContainsSpringWordInListFunctional(List<String> courses) {
		System.out.println("-------------------Print courses containing the word spring---------------------------");
		courses.stream()
		.filter(course -> course.contains("Spring"))// Lambda Expression
		.forEach(System.out::println);
		
	}


	private static void printAllCoursesInListFunctional(List<String> courses) {
		System.out.println("-------------------Print All courses from the List---------------------------");
		courses.stream()
		.forEach(System.out::println);
	}


	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
		System.out.println("-------------------Print Odd numbers from the list---------------------------");
		numbers.stream()
			.filter(number -> number % 2 != 0)// Lambda Expression
			.forEach(System.out::println);
	}
	
	private static void printSquaresOfEvenNumbers(List<Integer> numbers) {
		System.out.println("-------------------Print Squares Of Even Numbers---------------------------");
		numbers.stream()
			.filter(number -> number % 2 == 0)// Lambda Expression
			.map(number -> number * number)
			.forEach(System.out::println);
	}
	
	private static void printCubesOfOddNumbers(List<Integer> numbers) {
		System.out.println("-------------------Print Cubes Of Odd Numbers---------------------------");
		numbers.stream()
			.filter(number -> number % 2 != 0)// Lambda Expression
			.map(number -> number * number * number)
			.forEach(System.out::println);
	}
	
	private static void printNumberOfCharactersInEachCourseName(List<String> courses) {
		System.out.println("-------------------Print Number Of Characters In Each Course Name---------------------------");
		courses.stream()
		.map(course -> course+" --> "+course.length())// Lambda Expression
		.forEach(System.out::println);
		
	}

}
