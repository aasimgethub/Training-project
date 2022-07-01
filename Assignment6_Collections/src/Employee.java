
public class Employee {
	private int ID;
	private String Name;
	private String Department;
	private int salary;
	public Employee(int iD, String name, String department, int salary) {
		super();
		ID = iD;
		Name = name;
		Department = department;
		this.salary = salary;
	}
	
	public Employee() {
		super();
	}

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", Name=" + Name + ", Department=" + Department + ", salary=" + salary + "]";
	}
	
}

