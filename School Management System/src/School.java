import java.util.List;

public class School {
	/*
	 * many teachers and many students need to implement arrayList
	 */
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;

	public School(List<Teacher> teachers, List<Student> students) {
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	}
/*
 * to get list of teachers
 */
	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void addTeacher(Teacher teacher) {
	teachers.add(teacher);
	}

	public List<Student> getStudents() {
		return students;
	}

	/*
	 * add a new student to the list
	 */
	public void addStudent(Student student) {
		students.add(student);
	}

	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	public static void updateTotalMoneyEarned(int moneyEarned) {
		totalMoneyEarned += moneyEarned;
	}

	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	public static void updateTotalMoneySpent(int moneySpent) {
		totalMoneyEarned -= moneySpent;
	}
	
	
}

