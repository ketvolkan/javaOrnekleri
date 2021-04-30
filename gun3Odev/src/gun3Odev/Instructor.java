package gun3Odev;


public class Instructor extends User {

	private int salary;
	private String entryDate;
	private Lessons job;
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}
	public Lessons getJob() {
		return job;
	}
	public void setJob(Lessons job) {
		this.job = job;
	}
	
}
