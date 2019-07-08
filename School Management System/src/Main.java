import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	      Teacher lizzy = new Teacher(1,"Lizzy",500);
	      Teacher melissa = new Teacher(2, "Melissa", 700);
	      Teacher vanderhorn = new Teacher(3,"Vanderhorn", 600);
	      
	      List<Teacher> teacherList = new ArrayList<>();
	      teacherList.add(lizzy);
	      teacherList.add(melissa);
	      teacherList.add(vanderhorn);
	      
	      
	      Student tamasha = new Student(1, "Tamasha", 4);
	      Student rakshit = new Student(2,"Rakshit", 12);
	      Student rabbi = new Student(3, "Rabbi", 5);
	      
	      
		  List<Student> studentList = new ArrayList<>();
		  studentList.add(tamasha);
		  studentList.add(rakshit);
		  studentList.add(rabbi);
		     
	     School ghs = new School(teacherList, studentList);
	     ghs.getTotalMoneyEarned();
	    
	     
	     tamasha.payFees(5000);
	     rakshit.payFees(6000);
	     System.out.println("GHS HAS EARNED $" + ghs.getTotalMoneyEarned());
	     
	     System.out.println("---------MAKING SCHOOL PAY SALARY----------");
	     lizzy.receiveSalary(lizzy.getSalary());
	     System.out.println("GHS has spent salary to" +lizzy.getName() + "and now has $" + ghs.getTotalMoneyEarned());
	     
	     vanderhorn.receiveSalary(vanderhorn.getSalary());
	     System.out.println("GHS has spent salary to" +vanderhorn.getName() + "and now has $" + ghs.getTotalMoneyEarned());
	     
	     
	  
	     
	     melissa.receiveSalary(melissa.getSalary());
	     
	     System.out.println(rakshit);
	     System.out.println(melissa);
	    
	     System.out.println("Fee Balance for  " + tamasha.getName()+  " is $" +tamasha.getRemainingFees());
	     System.out.println("Fee Balance for " +rakshit.getName()+ " is  $" +rakshit.getRemainingFees());




	}

}
