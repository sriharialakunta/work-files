package SortingAlgorithms;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int i = sc.nextInt();
		System.out.println(fact(i));

	}

	public static int fact(int n) {
		// TODO Auto-generated method stub
		if(n == 0) {
			return 1;
		}
		else{
			return (n*fact(n-1));
		}
		
	}

}
