package FPWJ;
import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class demo {
	
	 public static void main(String[] args) {
	
		 System.out.println("Enter a strting ");
		 Scanner sc = new Scanner((System.in));
		sc.useDelimiter("\n");
		List<String> list = new ArrayList<String>();
		 while(sc.hasNext()) {
			 list.add(sc.next()); 
			 break;
		 }
		 list.stream()
		 	.filter(course -> course.length() > 4)
		 	.forEach(System.out::print);
	// System.out.println(list);
	 }
		 
}

