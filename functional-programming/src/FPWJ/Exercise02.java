package FPWJ;

import java.util.List;

public class Exercise02 {
		/*Print All Courses individually
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes")*/
		public static void main(String[] args) {
			
			List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
			
			courses.stream()
				.forEach(System.out::println);
		}
}
