package gun3Odev;

public class Lessons {
		private String lessonName;
		private String lessonClass;		
		private byte AKTS;
		private byte lessonHour;
		
		public Lessons(String lessonName, String lessonClass, byte aKTS, byte lessonHour) {
			super();
			this.lessonName = lessonName;
			this.lessonClass = lessonClass;
			AKTS = aKTS;
			this.lessonHour = lessonHour;
		}
		
		public String getLessonName() {
			return lessonName;
		}
		public void setLessonName(String lessonName) {
			this.lessonName = lessonName;
		}
		public String getLessonClass() {
			return lessonClass;
		}
		public void setLessonClass(String lessonClass) {
			this.lessonClass = lessonClass;
		}
		public byte getAKTS() {
			return AKTS;
		}
		public void setAKTS(byte aKTS) {
			AKTS = aKTS;
		}
		public byte getLessonHour() {
			return lessonHour;
		}
		public void setLessonHour(byte lessonHour) {
			this.lessonHour = lessonHour;
		}
		
}
