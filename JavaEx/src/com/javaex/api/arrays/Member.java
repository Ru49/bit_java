package com.javaex.api.arrays;

// 사용자 정의 객체가 정렬, 비교 들의 기능을 수행하기 위해서는 Comparable 인터페이스를 구현해줘야 한다
public class Member /*implement Comparable*/{
	// 필드
	private String name;
	
	// 생성자
	public Member(String name) {
		this.name = name;
	}

	// Getter / Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;		
	}

	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}
	
	
	
}

