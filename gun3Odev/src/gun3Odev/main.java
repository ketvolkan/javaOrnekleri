package gun3Odev;


public class main {

	public static void main(String[] args) {
		Lessons[] lessons =new Lessons[5];
		lessons[0]= new Lessons("Matematik", "123-B",(byte)8,(byte)6);
		lessons[1]= new Lessons("Ýngilizce", "121-B",(byte)4,(byte)3);
		lessons[2]= new Lessons("Fizik", "122-B",(byte)6,(byte)4);
		lessons[3]= new Lessons("Kimya", "123-A",(byte)5,(byte)4);
		lessons[4]= new Lessons("Bioloji", "120-B",(byte)5,(byte)4);
		
		lessonsManager lManager= new lessonsManager();
		lManager.showLessons(lessons);
		
		Instructor ogretmen = new Instructor();
		ogretmen.setAge((byte)23);
		ogretmen.setEntryDate("15/02/2012");
		ogretmen.setFirstName("Ahmet");
		ogretmen.setLastName("Çakar");
		ogretmen.setGender('E');
		ogretmen.setJob(lessons[0]);
		ogretmen.setSalary(3300);
		
		Student ogr = new Student();
		ogr.setAge((byte)19);
		ogr.setFirstName("Volkan");
		ogr.setLastName("Ket");
		ogr.setGender('E');
		ogr.setStudentClass("Örgün1");
		ogr.setStudentNumber("44443333");
		ogr.setNote(70);
		
		UserManager userManager1 = new StudentManager();
		userManager1.add(ogr);
		
		UserManager userManager2 = new InstructorManager();
		userManager2.add(ogretmen);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.showLesson(ogretmen);
		instructorManager.studentNoteChange(ogr, 10);
		
		StudentManager studentManager = new StudentManager();
		studentManager.odevTeslim("1. Yarýyýl Vize Ödevi");
		
	}

}
