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
		
		int raw, space, column;

		for (raw = 1; raw <= 7; raw++) {

			for (space = 1; space < raw; space++) {
				System.out.print(" ");
			}

			for (column = raw; column <= 7; column++) {
				System.out.print(column + " ");
			}

			System.out.println();

		}

		for (raw = 6; raw >= 1; raw--) {

			for (space = 1; space < raw; space++) {
				System.out.print(" ");
			}

			for (column = raw; column <= 7; column++) {
				System.out.print(column + " ");
			}

			System.out.println();

		}

	}

}
