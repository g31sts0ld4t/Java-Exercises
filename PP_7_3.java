package testProject1;

import java.util.Scanner;

public class PP_7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter a value between 1 and 100 inclusive");
		int int1 = input1.nextInt();
		int [] numCount = new int[10];
		while (int1 > 0 && int1 < 101) {
			if (int1 > 0 && int1 < 101) {
				//check value
				if (int1 < 11) {
					numCount[0] += 1;
				}
				else if (int1 < 21) {
					numCount[1] += 1;
				}
				else if (int1 < 31) {
					numCount[2] += 1;
				}
				else if (int1 < 41) {
					numCount[3] += 1;
				}
				else if (int1 < 51) {
					numCount[4] += 1;
				}
				else if (int1 < 61) {
					numCount[5] += 1;
				}
				else if (int1 < 71) {
					numCount[6] += 1;
				}
				else if (int1 < 81) {
					numCount[7] += 1;
				}
				else if (int1 < 91) {
					numCount[8] += 1;
				}
				else {
					numCount[9] += 1;
				}
				System.out.println("Enter next value");
				int1 = input1.nextInt();
			}
		}
		if (int1 < 1 || int1 > 100) {
			System.out.println("Value is out of bounds");
		}
		String ast = "*";
		System.out.println("  1-10   |  " + ast.repeat(numCount[0]));
		System.out.println(" 11-20   |  " + ast.repeat(numCount[1]));
		System.out.println(" 21-30   |  " + ast.repeat(numCount[2]));
		System.out.println(" 31-40   |  " + ast.repeat(numCount[3]));
		System.out.println(" 41-50   |  " + ast.repeat(numCount[4]));
		System.out.println(" 51-60   |  " + ast.repeat(numCount[5]));
		System.out.println(" 61-70   |  " + ast.repeat(numCount[6]));
		System.out.println(" 71-80   |  " + ast.repeat(numCount[7]));
		System.out.println(" 81-90   |  " + ast.repeat(numCount[8]));
		System.out.println(" 91-100  |  " + ast.repeat(numCount[9]));
	}

}
