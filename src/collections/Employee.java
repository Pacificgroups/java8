package collections;

public class Employee {
	
	private Integer empid;
	private String empname;
	private String epmddress;
	private String gender;
	
//	public Employee(int i, String string, String string2, String string3) {
//		// TODO Auto-generated constructor stub
//	}
	
	
	

	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEpmddress() {
		return epmddress;
	}
	public void setEpmddress(String epmddress) {
		this.epmddress = epmddress;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Employee(Integer empid, String empname, String epmddress, String gender) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.epmddress = epmddress;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", epmddress=" + epmddress + ", gender=" + gender
				+ "]";
	}
	
	
	
	
	

}
