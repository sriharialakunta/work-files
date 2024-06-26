package FPWJ;

import java.util.List;

public class Exercise05 {
	//Print the cubes of odd numbers
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		printCubesOfOddNumbersInListFunctional(numbers);
	}

	private static void printCubesOfOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
				.filter(number -> number % 2 != 0)
				.map (number -> number * number * number)
				.forEach(System.out::println);
	}

}

