package vezbaAnanas;

public class Zadatak1 {

	public static void main(String[] args) {
		
//		1.Given an int array, write a source code method to total all the values that are
//		even numbers
//		(code can be written in Java, C# or any other language, also can be script, it can be also
//		written in pseudo-code)
		
		
		int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] % 2 == 0) {
				sum = sum + intArray[i];
			}
		}
		System.out.println(sum);

	}

}
