import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		double td;
		double yd;
		double INT;
		double comp;
		double att;
		double a;
		double b;
		double c;
		double d;
		double PR;
	
		Scanner scanner = new Scanner(System.in);
	
		// User input
		System.out.println("Enter total number of touchdowns: ");
		td = scanner.nextDouble();
		System.out.println("Enter total number of yards: ");
		yd = scanner.nextDouble();
		System.out.println("Enter total number of interceptions: ");
		INT = scanner.nextDouble();
		System.out.println("Enter total number of completions: ");
		comp = scanner.nextDouble();
		System.out.println("Enter total number of passes attempted: ");
		att = scanner.nextDouble();
		
		// Calculations
		
		a = ((comp / att) - .3) * 5;
		b = ((yd / att) - 3) * .25;
		c = ((td / att) * 20);
		d = 2.375 - ((INT / att) * 25);
		
		PR = (((a + b + c + d) / 6) * 100);
		
		
		System.out.println("The player's passer rating is " + PR);
	
	}
}
