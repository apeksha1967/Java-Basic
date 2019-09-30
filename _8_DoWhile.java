package One;

import java.util.Scanner;

public class _8_DoWhile {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/*
		System.out.println("Enter a number:");
		int num = input.nextInt();
		
		while(num!=5) {
			System.out.println("Enter a number:");
			num = input.nextInt();
		}
		System.out.println("Got 5!");
		*/
		
		int num = 0;
		do {
			System.out.println("Enter a number:");
			num = input.nextInt();
		}while(num!=5);
			
		System.out.println("Got 5!");

	}

}
