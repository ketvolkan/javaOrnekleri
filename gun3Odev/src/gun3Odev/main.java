package gun3Odev;

import java.sql.Date;

public class main {

	public static void main(String[] args) {
		Instructor ogretmen = new Instructor();
		ogretmen.setAge((byte)23);
		ogretmen.setEntryDate("15/02/2012");
		ogretmen.setFirstName("Ahmet");
		ogretmen.setLastName("Çakar");
		ogretmen.setGender('E');
		ogretmen.setJob("Matematik");
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

	}

}
