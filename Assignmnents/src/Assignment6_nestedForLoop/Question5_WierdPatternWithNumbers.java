package Assignment6_nestedForLoop;

public class Question5_WierdPatternWithNumbers {

	public static void main(String[] args) {

		/*
		 	Write a Java program to print the following pattern

				1111111
				1111122
				1111333
				1114444
				1155555
				1666666
				7777777
		 */

		int raw, space, column;

		for (raw = 1; raw <= 7; raw++) {
			for (space = 6; space > raw - 1; space--) {
				System.out.print("1");
			}
			for (column = 1; column <= raw; column++) {
				System.out.print(raw + "");
			}
			System.out.println();
		}

	}

}
