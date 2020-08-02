package _00_IntroToArrays;

import java.util.ArrayList;
import java.util.Random;

import org.omg.Messaging.SyncScopeHelper;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] strings = { "Bob", "Joe", "Billy", "Rick", "Luke" };
		// 2. print the third element in the array
		System.out.println(strings[2]);
		// 3. set the third element to a different value
		strings[2] = "Billy II";
		// 4. print the third element again
		System.out.println(strings[2]);
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice
		for (int i = 0; i < strings.length; i++) {
			strings[i] = "Jim";
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		// 7. make an array of 50 integers
		int[] numbers = new int[50];
		// 8. use a for loop to make every value of the integer array a random number
		Random rand = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(101);
		}
		// 9. without printing the entire array, print only the smallest number on the
		// array
		int smallestNumber = 1000;
		for (int j = 0; j < numbers.length; j++) {
			if (numbers[j] < smallestNumber) {
				smallestNumber = numbers[j];
			}
		}
		System.out.println("Smallest Number: "+smallestNumber);
		// 10 print the entire array to see if step 8 was correct
		System.out.println("ALL NUMBERS");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		// 11. print the largest number in the array.
		int largestNumber = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largestNumber) {
				largestNumber = numbers[i];
			}
		}
		System.out.println("Largest Number: "+largestNumber);
		// 12. print only the last element in the array
System.out.println(numbers.length-1);
	}
}
