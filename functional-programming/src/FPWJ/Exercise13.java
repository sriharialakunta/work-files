package FPWJ;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise13 {
	/*Do Behavior Parameterization for the mapping logic.
	 List squaredNumbers = numbers.stream() .map(x -> x*x) .collect(Collectors.toList());
	 */
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		printSquaredNumbersInListFunctional(numbers);
	}

	private static void printSquaredNumbersInListFunctional(List<Integer> numbers) {
		
		 List squaredNumbers = numbers.stream()
				 					.map(x -> x*x) 
				 					.collect(Collectors.toList());
		 squaredNumbers.forEach(System.out::println);
	}
}