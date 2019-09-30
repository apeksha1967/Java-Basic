package One;

import java.util.Scanner;

public class _9_Switch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter text:");
		String text = input.nextLine();
		
		switch(text) {
		case "start":
			System.out.println("Started");
			break;
			
		case "stop":
			System.out.println("Stopped");
			break;
			
			default:
				System.out.println("I don't know");
		}

	}

}
