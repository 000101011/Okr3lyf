package learningjava;

public class MyClass2 {
	/* 
	 * + addition
	 * - subtraction
	 * * multiplication
	 * / division
	 * % division with remainder output 
	 */ 
	
	/*
	 * pre function:
	 * int x = 1;
	 * x++;
	 * System.out.println(x); (output would be 2)
	 * or
	 * int x = 1;
	 * System.out.println(++x); (output would be 2)
	 * 
	 * post function:
	 * int x = 1;
	 * System.out.println(x++); (output would be 1)
	 * System.out.println(x); (output would be 2)
	 */
	
	/*
	 * x += 5; (same as x = x + 5;)
	 * x -= 5; (same as x = x - 5;)
	 * x *= 5; (same as x = x * 5;)
	 * x /= 5; (same as x = x / 5;)
	 */
	public static void main(String[] args) {
		double a , b , answer;
		a = 70;
		b = 30;
		answer = a / b;
		
		System.out.println("Answer = " + answer);
	}

}
