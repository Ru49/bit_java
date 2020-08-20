package com.javaex.api.objectcall.v4;

public class Scoreboard {
	
	// 생성자
	
	// Getter / Setter
	public int[] getScores() {
		return scores;
	}
	
	public void setScores(int[] scores) {
		this.scores = scores;
	}
		
	//  복제 메서드
	public Scoreboard getClone() {
		Scoreboard clone = null;
		try {
			clone = (Scoreboard)clone();
		} catch (CloneNotSupportedException e) {
			System.err.println("복제를 지원하지 않음");
		}
		return clone;
	}

}

	