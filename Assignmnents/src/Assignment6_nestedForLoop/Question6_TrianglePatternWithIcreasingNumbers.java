package Assignment6_nestedForLoop;

public class Question6_TrianglePatternWithIcreasingNumbers {

	public static void main(String[] args) {
		
		/*
		 	Write a Java program to print the following pattern

				1
				2 6
				3 7 10
				4 8 11 13
				5 9 12 14 15
		 */

		
		for (int i = 1; i <= 5; i++) {

			int total = i;
			System.out.print(total + " ");

			for (int j = 1; j < i; j++) {

				total += (5 - j);
				System.out.print(total + " ");
			}
			System.out.println();
		}

	}

}
