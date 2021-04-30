package gun3Odev;

public class InstructorManager extends UserManager {
    @Override
	public void add(User usr) {
		System.out.println(usr.getFirstName()+"  Eklendi!");
	}
    public void showLesson(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" Hocan�n Dersi "+instructor.getJob().getLessonName());
	}
    public void studentNoteChange(Student student,int changes) {
    	student.setNote(student.getNote()+changes);
		System.out.println(student.getStudentNumber()+" Numaral� ��rencinin Puan� De�i�ti "+ (student.getNote()-changes)+" --> "+student.getNote());
	}
}
