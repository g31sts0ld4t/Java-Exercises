package testProject1;

import java.util.Scanner;

public class PP_7_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter integer between -25 and 25 inclusive");
		int int1 = input1.nextInt();
		int [] numCount = new int[51];
		if (int1 >= -25 && int1 <= 25) {
			do {
				numCount[int1 + 25] += 1;
				System.out.println("Enter next integer between -25 and 25 inclusive");
				int1 = input1.nextInt();
			
			} while(int1 >= -25 && int1 <= 25);
			for (int i = 0; i <= 50; i++) {
				if (numCount[i] > 0) {
					System.out.println("Number of " + (i - 25) + "'s is: " + numCount[i]);
				}
			}
		} else {
			System.out.println("Invalid integer selection");
		}
	}

}

