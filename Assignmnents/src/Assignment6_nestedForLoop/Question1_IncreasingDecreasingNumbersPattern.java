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
		
		int raw, column;

		for (raw = 1; raw <= 7; raw++) {
			for (column = 1; column <= raw; column++) {
				System.out.print(column + " ");
			}
			System.out.println();
		}

		for (raw = 7; raw >= 1; raw--) {
			for (column = 1; column < raw; column++) {
				System.out.print(column + " ");
			}
			System.out.println();
		}
	}

}
