package Entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Employee")
public class Employee {

	public Employee(int empid, String name, String deptid) {
		super();
		this.empid = empid;
		this.name = name;
		this.deptid = deptid;
	}
	private int empid;
	private String name;
	private String deptid;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeptid() {
		return deptid;
	}
	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}
	
}
