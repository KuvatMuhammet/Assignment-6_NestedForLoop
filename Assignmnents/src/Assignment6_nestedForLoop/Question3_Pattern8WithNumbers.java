package Assignment6_nestedForLoop;

import java.util.Scanner;

public class Question3_Pattern8WithNumbers {

	public static void main(String[] args) {
		
		/*
		 	Write a Java program to print the following pattern

				1 2 3 4 5 6 7
				 2 3 4 5 6 7
				  3 4 5 6 7
				   4 5 6 7
				    5 6 7
				     6 7
				      7
				     6 7
				    5 6 7
				   4 5 6 7
				  3 4 5 6 7
				 2 3 4 5 6 7
				1 2 3 4 5 6 7
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the numbers of row:");
		int numbersOfRow = scan.nextInt();
		
		for (int i = 1; i <= numbersOfRow; i++) {

			for (int k = 1; k < i; k++) {
				System.out.print(" ");
			}

			for (int j = i; j <= numbersOfRow; j++) {
				System.out.print(column + " ");
			}

			System.out.println();

		}

		for (int i = numbersOfRow - 1; i >= 1; i--) {

			for (int k = 1; k < i; k++) {
				System.out.print(" ");
			}

			for (int j = i; j <= numbersOfRow; j++) {
				System.out.print(column + " ");
			}

			System.out.println();

		}

	}

}
