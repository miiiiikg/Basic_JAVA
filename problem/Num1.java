package problem;

import java.util.Scanner;

public class Num1 {
	
	public static void main(String[] args) {
		
		int fst; int scd; int third; int scd1;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요>>");
		int num1 = sc.nextInt(); //756
		fst = num1/100; // 7
		scd = num1-(fst*100); // 756-700= 56
		scd1 = scd % 10; // 56%10 = 6
		third = scd/10; //5
		
		System.out.println(fst+scd1+third);
		
	}

}
