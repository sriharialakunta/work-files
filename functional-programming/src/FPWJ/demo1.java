package FPWJ;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class demo1 {		

public static void main(String[] args) {
    System.out.println("Please enter the numbers ");  
    ArrayList<Integer>numbers = new ArrayList<Integer>();
     Scanner sc = new Scanner(System.in);
    sc.useDelimiter("\s");
     while (true){   
         numbers.add(sc.nextInt());
         System.out.println("enter ");
      //  if(sc.nextInt() == 2) 
        		break;
        
     }
     sc.close();
     System.out.println(numbers);
	printOddNumbersInListFunctional(numbers);
	}

private static void printOddNumbersInListFunctional(List<Integer> numbers) {
	numbers.stream() 
			.filter(number -> number % 2 != 0) 
			.forEach(System.out::println);
	}
}