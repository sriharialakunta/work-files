package FPWJ;

import java.util.List;

import java.util.stream.Collectors;

public class Exercise11 {
	//Create a List with lengths of all course titles.
	public static void main(String[] args) {
		
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		courses.stream()
			.map(course -> course.length())
			.collect(Collectors.toList())
			.forEach(System.out::println);
	}
}
