package _03_More_Array_Fun;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		MoreArrayFun arrays = new MoreArrayFun();
		arrays.printStrings();
		System.out.println("\nNext Method");
		arrays.printStringsReverse();
		System.out.println("\nNext Method");
		arrays.printEveryOtherString();
		System.out.println("\nNext Method");
		arrays.printRandomOrder();
	}

	String[] letters = { "aaaa", "bbbb", "cccc", "dddd", "eeee", "ffff", "gggg", "hhhh", "iiii", "jjjj", };

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.

	void printStrings() {
		for (int i = 0; i < letters.length; i++) {
			System.out.print(letters[i]);
			System.out.print(", ");
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.

	void printStringsReverse() {
		for (int i = letters.length - 1; i >= 0; i--) {
			System.out.print(letters[i]);
			System.out.print(", ");
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.

	void printEveryOtherString() {
		for (int i = 0; i < letters.length; i++) {
			if (i % 2 == 0) {
				System.out.print(letters[i]);
				System.out.print(", ");
			}

		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	Random rand = new Random();

	void printRandomOrder() {
		for (int i = 0; i < letters.length; i++) {
			int randomNumber = rand.nextInt(letters.length);
			if (i != randomNumber) {
				String temp = "";
				temp = letters[i];
				letters[i] = letters[randomNumber];
				letters[randomNumber] = temp;
			}
		}
		for (int i = 0; i < letters.length; i++) {
			System.out.print(letters[i] + ", ");
		}
		Collections.shuffle(Arrays.asList(letters));
		System.out.println("");
		for (int i = 0; i < letters.length; i++) {
			System.out.print(letters[i] + ", ");
		}
	}
}