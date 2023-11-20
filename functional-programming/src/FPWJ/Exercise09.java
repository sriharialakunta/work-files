package FPWJ;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise09 {
	//Find Sum of Odd Numbers in a list
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		System.out.println(printSumOfOddNumbersInListFunctional(numbers));
	}

	private static int printSumOfOddNumbersInListFunctional(List<Integer> numbers) {

		return numbers.stream()
				.filter(number -> number % 2 != 0) 
				.parallel()
				.reduce(0,Integer::sum);
	}
}
