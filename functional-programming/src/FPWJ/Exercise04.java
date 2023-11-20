package FPWJ;

import java.util.List;

public class Exercise04 {
	//Print Courses Whose Name has atleast 4 letters
		public static void main(String[] args) {
			
			List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");

			courses.stream()
				.filter(course -> course.length() >= 4)
				.forEach(System.out::println);
			
	}
}
