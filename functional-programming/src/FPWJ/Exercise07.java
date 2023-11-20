package FPWJ;

import java.util.List;

public class Exercise07 {
	//Square every number in a list and find the sum of squares
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		System.out.println(printSumOfSquareNumbersInListFunctional(numbers));
	}

	private static int printSumOfSquareNumbersInListFunctional(List<Integer> numbers) {
		
	return numbers.stream()
			.map (number -> number * number)
			.parallel()
			.reduce(0,Integer::sum);
	}
				


}
