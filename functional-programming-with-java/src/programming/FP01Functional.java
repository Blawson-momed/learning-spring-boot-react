package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,6,1,78,4,5,9);
		//printAllNumbersInListFunctional(numbers);
		printAllEvenNumbersInListFunctional(numbers);
	}
	
	//private static void print(int number) {
	//	System.out.println(number);
	//}
	
	private static boolean isEven(int number) {
		return number%2==0;
	}
	
	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		//numbers.stream().forEach(FP01Structured::print);//Method Reference
		//forEach of the numbers go to this class and put each number into the parameters for the method
								
		numbers.stream().forEach(System.out::println);
		
	}
	
	private static void printAllEvenNumbersInListFunctional(List<Integer> numbers) {
		//numbers.stream().forEach(FP01Structured::print);//Method Reference
		//forEach of the numbers go to this class and put each number into the parameters for the method
								
		numbers.stream()
			//.filter(FP01Functional::isEven)//filter - Only allow even numbers then move to next line - Method Reference
			.filter(number->number%2==0)//Lambda Expression
			.forEach(System.out::println);//Method Reference
		
	}

}
