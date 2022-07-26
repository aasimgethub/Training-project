package entity;

public class Department {

	public Department(String deptid, String dname, String locId) {
		super();
		this.deptid = deptid;
		this.dname = dname;
		this.locId = locId;
	}
	private String deptid;
	private String dname;
	private String locId;
	public String getDeptid() {
		return deptid;
	}
	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLocId() {
		return locId;
	}
	public void setLocId(String locId) {
		this.locId = locId;
	}
	
}
