package FPWJ;
import java.util.List;
import java.util.Scanner;
public class Exercise01 {
		//Print Only Odd Numbers from the List
		public static void main(String[] args) {
			List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		    Scanner sc=new Scanner(System.in);
			printOddNumbersInListFunctional(numbers);
		}

		private static void printOddNumbersInListFunctional(List<Integer> numbers) {
			numbers.stream() 
					.filter(number -> number % 2 != 0) 
					.forEach(System.out::println);
			}
}
