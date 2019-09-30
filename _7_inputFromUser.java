package One;

import java.util.Scanner;

public class _7_inputFromUser {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter data:");
		String text = input.nextLine();
		System.out.println("Entered data: "+text);
		
		System.out.println("\nEnter number:");
		int num = input.nextInt();
		System.out.println("Entered number: "+num);
		
		System.out.println("\nEnter float:");
		float num2 = input.nextFloat();
		System.out.println("Entered float: "+num2);

	}

}
