package Assignment6_nestedForLoop;

import java.util.Scanner;

public class Question1_IncreasingDecreasingNumbersPattern {

	public static void main(String[] args) {
		
		/*
		 	Write a Java program to print the following pattern

				1
				1 2
				1 2 3
				1 2 3 4
				1 2 3 4 5
				1 2 3 4 5 6
				1 2 3 4 5 6 7
				1 2 3 4 5 6
				1 2 3 4 5
				1 2 3 4
				1 2 3
				1 2
				1
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the numbers of row:");
		int numbersOfRow = scan.nextInt();
		
		for (int i = 1; i <= numbersOfRow; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		for (int i = numbersOfRow; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
