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
		
			Scanner scan = new Scanner(System.in);
		
			System.out.println("Enter the numbers of row:");
			int numbersOfRow = scan.nextInt(); 
		
			for (int i = 1; i <= numbersOfRow; i++) {
				for (int j = 1; j <= i; j++) {
					if (j % 2 == 1) {
						System.out.print(1);
					} else {
						System.out.print(0);
					}
					
				}
				System.out.println();
			}

		}

	}
