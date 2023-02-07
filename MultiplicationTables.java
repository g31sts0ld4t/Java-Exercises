package testProject1;

import java.util.Scanner;

public class MultiplicationTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter an integer");
		int int1 = input1.nextInt();
		
		int i = 1;
		while (i <= 10) {
			int j = int1 * i;
			System.out.println(int1 + " x " + i + " = " + j);
			i ++;
		}
	}

}
