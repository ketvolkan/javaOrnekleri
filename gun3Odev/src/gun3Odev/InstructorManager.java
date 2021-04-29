package gun3Odev;

public class InstructorManager extends UserManager {
    @Override
	public void add(User usr) {
		System.out.println(usr.getFirstName()+" Eklendi!");
	}
    public void salaryChange(Instructor instructor,int changes) {
    	instructor.setSalary(changes);
    }
}
