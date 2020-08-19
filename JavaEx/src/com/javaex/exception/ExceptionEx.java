package com.javaex.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
//		arithmeticExceptionEx();
//		indexOutOfBoundsEx();
//		nullPointerException();
		customExceptionEx();
	}
	
	private static void customExceptionEx() {
		// 사용자 정의 예외의 활용
		ThrowExcept ex = new ThrowExcept();
		
		try {
//			ex.excuteCheckedException(); // 체크드 익셉션 발생
//			ex.excuteUncheckedException(); // 언체크드 익셉션 발생
			System.out.println("10/0 = " + ex.divide(10, 0));
		}catch (IOException e) {
			System.err.println("예외 메서지:" + e.getMessage());
		}catch (CustomArithmeticException e) {
			// 본 예외는 RuntimeException의 자손이므로
			// RuntimeException보다 위에서 catch 해 줘야
			System.err.println("사용자정의 예외 메세지:" + e.getMessage());
			System.err.printf("예외 상황 발생시 num1 = %d, num2 = %d%n", e.getNum1(), e.getNum2());
		}catch (RuntimeException e) {
			System.err.println("런타임 예외 메세지:" + e.getMessage());
		}
	}
		
		// 가장 흔히 발생하는 예외
		private static void nullPointerException() {
			String s = "Hello"; // 참조 객체
			
			s = null; // 참조 해제
			
			try {
				// 예외 가능 블록
				System.out.println(s.toUpperCase());
			}catch (NullPointerException e) {
				System.err.println("예외 메서지:" + e.getMessage());
				e.printStackTrace();
			}
			
			System.out.println("End of Code");
		}
	
		private static void indexOutOfBoundsEx() {
			int[] intArray = new int[] { 3, 6, 9 };
			
			System.out.println("배열의 길이:" + intArray.length);
			// 가장 마지막 인텓스 == length - 1
			try {
				// 예외 가능 코드 블락
				System.out.println(intArray[3]);
			} catch (IndexOutOfBoundsException e) {
				System.out.println("예외 메서지:" + e.getMessage)();
			}
			// finally는 생략 가능
			System.out.println("End of code");
				
		}

		private static void arithmeticExceptionEx() {
			// 스캐너로부터 정수 하나를 입력
			// 0으로 나눠 보자
			Scanner scanner = new Scanner(System.in);
			double result = 0;
			int num;
			
			System.out.print("정수룰 입력하세요:");
			try {
				// 예외가 발생할 구 있는 영역 -> try
				num = scanner.nextInt();
				result = 100 / num;
			} catch(ArithmeticException e) {
				// 메서지가 담겨 있다.
				System.err.println("예외 메서지:" + e.getMessage());
			} catch(InputMismatchException e) {
				// 예외 상황 전체를 확인하고자 한다면
				e.printStackTrace();
			}	
			
			System.out.println("결과:" + result);
			scanner.close();
		}
}

