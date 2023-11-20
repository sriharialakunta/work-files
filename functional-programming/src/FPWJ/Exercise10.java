package FPWJ;

import java.util.List;

import java.util.stream.Collectors;

public class Exercise10 {
	//Create a List with Even Numbers Filtered from the Numbers List
		public static void main(String[] args) {
			List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
			printEvenNumbersInListFunctional(numbers);
		}

		private static void printEvenNumbersInListFunctional(List<Integer> numbers) {

			numbers.stream()
					.filter(number -> number % 2 == 0) 
					.collect(Collectors.toList())
					.forEach(System.out::println);
		}
}
