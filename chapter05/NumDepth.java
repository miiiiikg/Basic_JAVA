package chapter05;

import java.util.Scanner;

public class NumDepth {
	
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//int num = sc.nextInt();
		
		int sum = 0;
		int end = 1;
		int i = 0;
		for(int fir = 1; fir<10; ) {
			sum = fir + end;
			if(sum>end) {
				i = end;
				end = sum;
				fir = i;
			}
			System.out.println(sum);
		 }
		
	}

}
