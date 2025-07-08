package programming;

import java.util.List;

public class EXOnlyOddNumbers {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(5,84,3,1,2,8,4,2,8,6,25,9,7,22,65,0);
		
		printOddNumbersOnly(numbers);
		printCubeOddNumbersOnly(numbers);

	}

	private static void printOddNumbersOnly(List<Integer> numbers) {
	
		//displays all odd numbers
		System.out.println("All Odd Numbers : ");
		numbers.stream().filter(number -> number%2 != 0).forEach(System.out::println);
		System.out.println();
				
	}
	
	private static void printCubeOddNumbersOnly(List<Integer> numbers) {
		
		//displays all odd numbers
		System.out.println("All Odd Numbers Cubed : ");
		numbers.stream().filter(number -> number%2 != 0).map(number -> number*number*number).forEach(System.out::println);
		System.out.println();
				
	}

}
