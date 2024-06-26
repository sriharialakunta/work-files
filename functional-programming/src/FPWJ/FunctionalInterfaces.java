package FPWJ;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class FunctionalInterfaces {
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
				
		Predicate<Integer> isEvenPredicate = x -> x%2==0;
		Function<Integer, Integer> squareFunction = x -> x * x;
		Consumer<Integer> sysoutConsumer = System.out::println;
		BinaryOperator<Integer> sumBinaryOperator = Integer::sum;
		//BinaryOperator<Integer> sumBinaryOperator = (x,y) => x + y;
		
		/*Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer x) {
				return x%2==0;
			}
			
		};*/
			numbers.stream()
				.filter(isEvenPredicate)
				.map(squareFunction)
				.forEach(sysoutConsumer);
			int sum = numbers.stream()
					.reduce(0, sumBinaryOperator);
					 System.out.println("sum is "+sum);
				
	}


}
