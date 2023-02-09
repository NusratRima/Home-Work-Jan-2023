package hw6IfElseCondition02;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		System.out.println("Today's Weather:");
		Scanner scanner = new Scanner(System.in);
		
		int temp1 = scanner.nextInt();
		int temp2 = scanner.nextInt();
		
if (temp1 < 32) {
	System.out.println("Freezing");
	} else if (temp1 < 55) {
		System.out.println("Pleasant");
	} else if (temp1 < 73) {
		System.out.println("Getting Warmer");
	} else if (temp1 > 101) {
	   System.out.println("Very Hot");
	} else {
		System.out.println("Please put a valid temperature");
	}

	}
}
