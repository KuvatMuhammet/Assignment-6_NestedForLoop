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

		int rows, columns, total;

		for (rows = 1; rows <= 5; rows++) {

			total = rows;
			System.out.print(total + " ");

			for (columns = 1; columns < rows; columns++) {

				total += (5 - columns);
				System.out.print(total + " ");
			}
			System.out.println();
		}

	}

}
