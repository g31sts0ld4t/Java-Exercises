package testProject1;

import java.util.Scanner;

public class PP_7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter integer between 0 and 50 inclusive");
		int int1 = input1.nextInt();
		int [] numCount = new int[51];
		if (int1 >= 0 && int1 <= 50) {
			do {
				numCount[int1] += 1;
				System.out.println("Enter next integer between 0 and 50 inclusive");
				int1 = input1.nextInt();
			
			} while(int1 >= 0 && int1 <= 50);
			for (int i = 0; i <= 50; i++) {
				if (numCount[i] > 0) {
					System.out.println("Number of " + i + "'s is: " + numCount[i]);
				}
			}
		} else {
			System.out.println("Invalid integer selection");
		}

	}
}
