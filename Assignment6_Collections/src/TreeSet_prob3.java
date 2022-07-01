import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

 	class SortById implements Comparator<Employee>{
 		
		
		@Override
		public int compare(Employee o1, Employee o2) {
			Integer x=o1.getID();
			Integer y =o2.getID();
			return x.compareTo(y);
		}
 		
 	}
   class SortByName implements Comparator<Employee>{
 		
	   public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
		   String s1=o1.getName();
		   String s2=o2.getName();
		   return s1.compareTo(s2);
	   }
		
 	}
   class SortByDept implements Comparator<Employee>{
		
		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			String d1=o1.getName();
			String d2=o2.getName();
			return d1.compareTo(d2);
		}
   }
   class SortBySalary implements Comparator<Employee>{
		
		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			Integer sal1=o1.getSalary();
			Integer sal2=o2.getSalary();
			return sal1.compareTo(sal2);
		}
  }
 
public class TreeSet_prob3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1,"Naman","Developer",30000);
		Employee e2 = new Employee(2,"Amit","Developer",45000);
		Employee e3 = new Employee(3,"Venkat","Developer",35000);
		Employee e4 = new Employee(4,"Sangam","Tester",20070);
		Employee e5 = new Employee(5,"Dheeraj","Developer",31000);
		Employee e6 = new Employee(6,"Rahul","Developer",30060);
		Employee e7 = new Employee(7,"Avinash","Developer",33000);
		Employee e8 = new Employee(8,"Jaya","Tester",15000);
		Employee e9 = new Employee(9,"Naman","Developer",30400);
		Employee e10 = new Employee(10,"Naman","Developer",30450);
		
//		TreeSet<Employee> T=new TreeSet<>();
//		
	

		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the below options from which you want to sort");
		System.out.println("1.ID"+"\n"+"2.Name"+"\n"+"3.Dept"+"\n"+"4.Salary");
		int n= sc.nextInt();
		if(n==1) {
			TreeSet<Employee> T=new TreeSet<>(new SortById());
			T.add(e1);
			T.add(e2);
			T.add(e3);
			T.add(e4);
			T.add(e4);
			T.add(e5);
			T.add(e6);
			T.add(e7);
			T.add(e8);
			T.add(e9);
			T.add(e10);
			for(Employee e:T) {
				System.out.println(e);
			}
			
		}
		else if(n==2) {
			
			TreeSet<Employee> T=new TreeSet<>(new  SortByName());
			T.add(e1);
			T.add(e2);
			T.add(e3);
			T.add(e4);
			T.add(e4);
			T.add(e5);
			T.add(e6);
			T.add(e7);
			T.add(e8);
			T.add(e9);
			T.add(e10);
			for(Employee e:T) {
				System.out.println(e);
			}
		}
		else if(n==3) {
			TreeSet<Employee> T=new TreeSet<>(new  SortBySalary());
			T.add(e1);
			T.add(e2);
			T.add(e3);
			T.add(e4);
			T.add(e4);
			T.add(e5);
			T.add(e6);
			T.add(e7);
			T.add(e8);
			T.add(e9);
			T.add(e10);
			for(Employee e:T) {
				System.out.println(e);
			}
			
		}
		else if(n==4) {
			TreeSet<Employee> T=new TreeSet<>(new  SortBySalary());
			T.add(e1);
			T.add(e2);
			T.add(e3);
			T.add(e4);
			T.add(e4);
			T.add(e5);
			T.add(e6);
			T.add(e7);
			T.add(e8);
			T.add(e9);
			T.add(e10);
			for(Employee e:T) {
				System.out.println(e);
			}
		}
		else {System.out.println("Enter Correct input");}
		 

	}

}



