package learningjava;

import java.util.Scanner;

public class MyClass {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a Sring");
		String user_input_string = scan.nextLine();
		System.out.println("The entered String is");
		System.out.println(user_input_string);
	}

}
