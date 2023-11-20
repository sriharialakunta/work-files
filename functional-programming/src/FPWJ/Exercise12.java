package FPWJ;

import java.util.List;

public class Exercise12 {
	//Find Functional Interface behind the second argument of reduce method. Create an implementation for the Functional Interface.

	
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		System.out.println(printSumOfSquareNumbersInListFunctional(numbers));
	}

	private static int printSumOfSquareNumbersInListFunctional(List<Integer> numbers) {
		int sum = numbers.stream() .reduce(0, Integer::sum);
		return sum;
		

	}
			

}
