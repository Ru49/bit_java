package com.javaex.basic;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
		//ifElseEx();
		//ifElseEx2();
		ifElseEx3();
	}
	
	public static void ifElseEx3() {
		// 과목 번호 입력
		// 1 -> R101, 2-> R202
		// 3 -> R303, 4 -> R404
		// 나머지 -> 관리자 문의
		Scanner scanner = new Scanner(System.in);
		System.out.print("1:C, 2:C++, 3:Java, 4:Python -");
		
		int code= scanner.nextInt();
		if (code == 1) {
			System.out.print("R101");
		} else if (code == 2) {
			System.out.print("R202");
		} else if (code == 3) {
			System.out.print("R303");
		} else if (code == 4) {
			System.out.print("R404");
		} else {
			System.out.print("관리자에게 문의하세요");
		}
		
		scanner.close();
	}
	
	public static void ifElseEx2() {
		// 점수 입력
		// 0보다 크면 양수, 0이면 0, 0보다 작으면 음수 출력
		// if ~ else if ~ else
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력: ");
		int num = scanner.nextInt();
		
		/*
		if(num > 0)
			System.out.println("양수");
		else if (num == 0)
			System.out.println("0");
		else
			System.out.println("음수");
		*/
		
		// 중첩 if : 1차로 필터링
		// 		내부 블록 안쪽에서 2차로 조건 판별
		if(num == 0) {
			// 0일 때
			System.out.println("0");
		} else {
			// 0이 아닐 때
			if(num > 0) {
				//양수
				System.out.println("양수");
			} else {
				//음수
				System.out.println("음수");
			}
		}
		
		scanner.close();
		
	}
	public static void ifElseEx(){
		// Scanner로 점수를 입력
		// 점수가 60점 이상이면 "합격"
		// 그렇지 않으면(60점 미만) "불합격"
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		
		// 판별(의사 결정)
		if (score >= 60) {
			// 비교값이 true일 때 실행
			System.out.println("합격!");
		} else {
			// 비교값이 false 일 때 실행
			System.out.println("불합격!");
		}
	}
	
}
