package programming;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PlayingWithOptional {

	public static void main(String[] args) {
		List<String> fruits = List.of("Pineapple", "Banana", "Grapes","Banaaaa");
		
		Predicate<? super String> predicate = fruit -> fruit.startsWith("B");
		Optional<String> optional = fruits.stream().filter(predicate).findFirst();
		System.out.println(optional);
		System.out.println(optional.isEmpty());
		System.out.println(optional.isPresent());
		System.out.println(optional.get());
		
		System.out.println();
		Optional<String> fruit = Optional.of("Apple");
		System.out.println(fruit.isEmpty());
		Optional<Object> empty = Optional.empty();
		System.out.println(empty.isPresent());


	}

}
