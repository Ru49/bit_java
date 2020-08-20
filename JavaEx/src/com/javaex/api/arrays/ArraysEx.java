package com.javaex.api.arrays;

import java.util.Arrays;
import java.util.Collections;
// Arrays 유틸리티 클래스
//	배열의 복제
//	배열의 정렬(Sort)
//	배열의 검색
public class ArraysEx {

	public static void main(String[] args) {
//		arrayCopyEx();
//		basicSortTest();
//		basicSortDescendingTest();
		customSortEx();
	}
	
	
	
	// 사용자 정의 정렬
	private static void customSortEx() {
		// Member 객체의 배열
		Member[] members = {
				new Member("홍길도"),
				new Member("고길동"),
				new Member("임꺽정"),
				new Member("장길산")
		};
		System.out.println("원본 배열: " + Arrays.toString(members));
		Arrays.sort(members);
		System.out.println("정렬된 배열: " + Arrays.toString(members));
	}
	
	// 역순 정력
	// 내림차순(Descending: 큰 값 -> 작은 값0
	private static void basicSortDescendingTest() {
		Integer[] scores = { 80, 50, 75, 90, 70, 88, 76};
		System.out.println("원본 배역: " + Arrays.toString(scores));
		// 역순 정렬
		Arrays.sort(scores, Collections.reverseOrder());
		System.out.println("역순 정렬: " +  Arrays.toString(scores));
	}
	
	// 배열의 정렬
	// 기본 정렬은 오름차순(Ascending: 작은 값 -> 큰 값 순)
	private static void basicSortTest() {
		int[] scores = { 80, 50, 75, 90, 70, 88, 76};
		System.out.println("원본 배역: " + Arrays.toString(scores));
		// 정렬
		Arrays.sort(scores);
		System.out.println("기본 정렬: " + Arrays.toString(scores));
	}

	private static void arrayCopyEx() {
		char src[] = "Java Programming".toCharArray(); // char 배열로
		
		// System 객체를 이용한 배열의 복사
		char target[] = new char[src.length];
		System.arraycopy(src, // 원본 배열
				0, // 시작 위치
				target, // 복사 대상 배열
				0, // 복사 시작 위치
				src.length); // 복사할 길이
		System.out.println("target: " + target);
		
		System.out.println(Arrays.toString(target)); // 보기 좋게 출력
		
		// Attays.copyOf 이용
		target = Arrays.copyOf(src, src.length);
		System.out.println("Arrays.copyOf 활용 복제: " + Arrays.toString(target));
		
		// 일부 복제
		target = Arrays.copyOfRange(src, // 원본 배역
				5, // 시작 위치
				11); // 끝 위치
		System.out.println("일부 복제: " + Arrays.toString(target));
	}

}
