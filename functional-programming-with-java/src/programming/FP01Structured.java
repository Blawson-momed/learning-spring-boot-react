package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,6,1,78,4,5,9);
		//printAllNumbersInListStructured(numbers);
		printAllEvenNumbersInListStructured(numbers);
	}

	//private static void printAllNumbersInListStructured(List<Integer> numbers) {
	//	//How to loop the numbers?
	//	for(int number:numbers) {
	//		System.out.println(number);
	//	}
		
	//}
	
	private static void printAllEvenNumbersInListStructured(List<Integer> numbers) {
		//How to loop the numbers?
		for(int number:numbers) {
			if(number%2==0) {
				System.out.println(number);
			}
		}
		
	}

}
