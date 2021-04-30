package gun3Odev;

public class lessonsManager {
	public void showLessons(Lessons[] lessons) {
		System.out.println("******DERSLER********");
		for (Lessons lessons2 : lessons) {
			System.out.println(lessons2.getLessonName()+" "+lessons2.getLessonClass());
		}
		System.out.println("*********************");
	}
}
