import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Employee> s = new HashSet<>();
		Employee e = new Employee(1, "Amit ", 300000, "Analyst");
		s.add(e);
       e.displayDetails();
	   System.out.println(s);
	}

}
