package program;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		System.out.println("Program running...");
		System.out.println("Program loaded");
		System.out.println("Please type in the password:");
		
		Scanner aConsole = new Scanner(System.in);
		String a = aConsole.nextLine();
		
		switch(a) {
		case "000101011":
			System.out.println("Success!");
			break;
		default:
			System.out.println("Failure");
		}
	
	}

}