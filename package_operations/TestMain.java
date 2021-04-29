package package_operations;
import java.util.Scanner;

public class TestMain {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		   
		System.out.println("Enter the first number: ");
		int num1 = in.nextInt();
		   
		System.out.println("Enter the second number: ");
		int num2 = in.nextInt();
		
		int sum = num1+num2;
		System.out.println("Sum of two numbers is" +sum);
		
		
		int difference = num1 - num2;
		System.out.println("Difference of two numbers is" +difference);
		
		
		int mult = num1 * num2;
		System.out.println("Multiplication of two numbers is" +mult);
	}

}
