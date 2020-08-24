package com.javaex.api.collection.hash;

public class Classroom {

	// 필드
		private String subject;
		private String roomName;
		
		// 생성자
		public Classroom(String subject) {
			this.subject = subject;
		}
		
		// 두 번째 생성자
		public Classroom(String subject, String roomName) {
			this(subject);
			this.roomName = roomName;
		}
		 
		// toString 오버라이드
		@Override
		public String toString() {
			return "Classroom [roomName=" + roomName + ", subject=" + subject + "]";
			
	}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Classroom) {
				return hashCode() == obj.hashCode();
			}
			return super.equals(obj);
		}

		@Override
		public int hashCode() {
			return subject.hashCode();
		}
		
		
}
