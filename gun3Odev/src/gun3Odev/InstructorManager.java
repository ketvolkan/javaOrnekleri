package gun3Odev;

public class InstructorManager extends UserManager {
    @Override
	public void add(User usr) {
		System.out.println(usr.getFirstName()+" Eklendi!");
	}
    
}
