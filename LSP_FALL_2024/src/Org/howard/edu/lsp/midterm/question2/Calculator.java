package Org.howard.edu.lsp.midterm.question2;

public class Calculator  {
	public static int sum(int a, int b) {
		return a + b; // sum of two integers 
	}
	public static double sum(double a, double b) {
		return a + b; //sum of two double values 
	}
	
	public static int sum(int[]numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number; //iterate through array using for loop and add each element
		}
		return sum;
	}
}