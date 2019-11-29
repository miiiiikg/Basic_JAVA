package chapter04;

import java.util.Scanner;

public class IfElse03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		while (true) {
			System.out.print("학생점수 >>>");
			score = sc.nextInt();
			if (score < 0 || score > 100) {
				System.out.println("0~ 100까지 다시 입력");
			} else {
				break;
			}

		}

		String grade = "";

		if (score >= 90) {
			if (score >= 96) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if (score >= 80) {
			if (score >= 86) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} else if (score >= 70) {
			if (score >= 76) {
				grade = "C+";
			} else {
				grade = "C";
			}
		} else if (score >= 60) {
			if (score >= 66) {
				grade = "D+";
			} else {
				grade = "D";
			}

		} else {
		grade = "F";
		}
		System.out.println("학점은:" + grade + "입니다");

	}
}
