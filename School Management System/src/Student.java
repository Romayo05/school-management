
public class Student {
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;

	/*school fees is 30,000 per year
	 * fees paid initially = 0.0
	 * 
	 * *
	 */
	public Student(int id, String name, int grade) {
		this.feesPaid = 0;
		this.feesTotal = 30000;
		this.id = id;
		this.name = name;
		this.grade = grade;
			
	}
	
	/*students name and id won't be altered so we don't need the setter name method
	 * 
	 */
	//used to update student's grade
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void payFees(int fees) {
		feesPaid += fees;
		School.updateTotalMoneyEarned(feesPaid);
	}
    /*
     * get student id
     */
	public int getId() {
	return id;
	}
	
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	
	public int getFeesPaid() {
		return feesPaid;
	}
	
	public int getFeesTotal() {
		return feesTotal;
	}
	
	public int getRemainingFees() {
		return feesTotal - feesPaid;
	     
	}
	public String toString() {
		return "Student's name: " + name +  " Total fees paid so far $" + feesPaid;
		
	}
	
	
	
	
}
