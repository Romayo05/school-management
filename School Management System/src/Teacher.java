
public class Teacher {
	/*
	 * keep tract of the name of teacher and salary
	 */
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	/*
	 * constructor to create new teacher object
	 */
	public Teacher(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned = 0;
		
	}
	
	/*
	 * returns the id of the teacher
	 */
	public int getId() {
		return id;
	}
	/*
	 * returns the name of the teacher
	 */
	public String  getName() {
		return name;
	}
	/*
	 * returns the salary of the teacher
	 */
    public int getSalary() {
    	return salary;
    }
    public void setSalary(int salary) {
    	this.salary = salary;
    }
    
    public void receiveSalary(int salary) {
    	salaryEarned += salary;
    	School.updateTotalMoneySpent(salary);
    	
    }
    
    public String toString(){
    	return "Teacher name:" + name + "salary earned so far $" +salaryEarned;
    	
    }
}
