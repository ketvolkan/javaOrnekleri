package gun3Odev;

public class StudentManager extends UserManager {
	@Override
	public void add(User usr) {
		System.out.println(usr.getFirstName()+" Eklendi!");
	}
	 public void noteChange(Student student,int changes) {
		 student.setNote(changes);
	}
}
