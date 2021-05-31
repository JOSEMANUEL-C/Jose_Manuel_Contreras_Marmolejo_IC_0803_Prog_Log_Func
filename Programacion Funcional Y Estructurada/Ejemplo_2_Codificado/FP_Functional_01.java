import java.util.List;

/* Structured Functional */

public class FP_Functional_01{

	public static void main(String[] args){
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		System.out.println("Using to --> [System.out::print] by default");
		printAllNumbersInListFunctional_Two(numbers);
		System.out.println("\nprintAllNumbersInListFunctional: ");
		printAllNumbersInListFunctional(numbers);
		System.out.println("\nprintEvenNumbersInListFunctional: ");
		printEvenNumbersInListFunctional(numbers);
		System.out.println("\nprintSquaresOfEvenNumbersInListFunctional: ");
		printSquaresOfEvenNumbersInListFunctional(numbers);
		System.out.println("");
	}

	private static void print(int number){
		System.out.print(number + ", " );
	}

	private static boolean isEven(int number){
		return (number % 8 == 0);
	}

	private static void printAllNumbersInListFunctional_Two(List<Integer> numbers){
		// What to do?
		numbers.stream()
		.forEach(System.out::print);
		System.out.println("");
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers){
		//What to do?
		numbers.stream()
		.forEach(FP_Functional_01::print);
		System.out.println("");
	}

	// number -> number % 8 == 0
	private static void printEvenNumbersInListFunctional(List<Integer> numbers){
		// What to do?
		numbers.stream()
		       .filter(FP_Functional_01::isEven)
		       .forEach(FP_Functional_01::print);
	     System.out.println("");
	}

	private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers){
		numbers.stream()
		       .filter(number -> number % 8 == 0)
		       .map(number -> number * number)
		       .forEach(FP_Functional_01::print);
		System.out.println("");
	}
}