package programming;

import java.util.List;

public class EXPrintAllTheCourses {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
		
		printAllCourses(courses);
		printSpecificCourse(courses);
		printAllCourses4ORMore(courses);
		printAllCoursesCharLength(courses);
		

	}

	private static void printAllCoursesCharLength(List<String> courses) {
		System.out.println("All Courses Char Length : ");
		courses.stream().map(course -> course.length()).forEach(System.out::println);
		System.out.println();
		
	}

	private static void printAllCourses4ORMore(List<String> courses) {
		System.out.println("All course with atleast 4 letters or more : ");
		courses.stream().filter(word -> word.length()>=4).forEach(System.out::println);
		System.out.println();
		
	}

	private static void printSpecificCourse(List<String> courses) {
		System.out.println("Specified Course : ");
		courses.stream().filter(course -> course == "Spring").forEach(System.out::println);
		System.out.println();
		
	}

	private static void printAllCourses(List<String> courses) {
		System.out.println("All Courses : ");
		courses.stream().forEach(System.out::println);
		System.out.println();
		
		
		
		
		//test
		//String name = "bobby";
		//System.out.println(name.length());
	}

}
