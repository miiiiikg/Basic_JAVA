package chapter04;

import java.util.Scanner;

public class IfElse02 {
	public static void main(String[] args) {
		// 학점 계산 프로그램
		Scanner sc = new Scanner(System.in);
		int score = 0;
		// 파트1: 학생점수 입력받는 부분
		while(true) {
			System.out.print("학생점수>>");
			score = sc.nextInt();
		
		if(score > 100 || score < 0) {
			System.out.println("0~100 : 다시 입력");
			} else {
				break; // 0~100 들어온 경우 반복문 빠져나감
			}
		}
		/*
		 * 90점 이상 A등급
		 * 80점 이상 B등급
		 * 70점 이상 C등급
		 * 60점 이상 D등급
		 * 60점 미만 F등급
		 * 파트2 : 학점 등급 매기는 부분
		 */
		String grade = ""; // 학점 등급
		if(score >= 90 && score <= 100) {
			grade = "A";
		} else if (score >= 80 && score < 90) {
			grade = "B";
		} else if (score >= 70 && score < 80 ) {
			grade = "C";
		} else if (score >= 60 && score < 70) {
			grade = "D";
		} else if (score < 60 && score >= 0) {
			grade = "F";
		} else {
			System.out.println("0~100사이의 값을 입력해주세요.");
		}
		System.out.println("당신은"+ grade + "학점입니다.");

	}
}
