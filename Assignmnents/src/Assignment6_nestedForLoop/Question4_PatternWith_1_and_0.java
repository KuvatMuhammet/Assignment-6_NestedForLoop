package Assignment6_nestedForLoop;

public class Question4_PatternWith_1_and_0 {

	public static void main(String[] args) {

			/*
			 	Write a Java program to print the following pattern

						1
						10
						101
						1010
						10101
						101010
						1010101
 			 */
		
			int raw, column;

			for (raw = 1; raw <= 6; raw++) {
				for (column = 1; column <= raw; column++) {
					if (column % 2 == 1) {
						System.out.print(1);
					} else {
						System.out.print(0);
					}
					
				}
				System.out.println();
			}

		}

	}
