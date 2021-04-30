package gun3Odev;

public class InstructorManager extends UserManager {
    @Override
	public void add(User usr) {
		System.out.println(usr.getFirstName()+"  Eklendi!");
	}
    public void showLesson(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" Hocanın Dersi "+instructor.getJob().getLessonName());
	}
    public void studentNoteChange(Student student,int changes) {
    	student.setNote(student.getNote()+changes);
		System.out.println(student.getStudentNumber()+" Numaralı Öğrencinin Puanı Değişti "+ (student.getNote()-changes)+" --> "+student.getNote());
	}
}
