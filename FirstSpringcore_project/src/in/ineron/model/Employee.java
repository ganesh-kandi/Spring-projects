package in.ineron.model;

public class Employee {
	  
	
	private String ename;
	private String eadder;
	private Integer eno;
	
	public Employee(String ename, String eadder, Integer eno) {
		this.ename = ename;
		this.eadder = eadder;
		this.eno = eno;
	}
	
	public Employee() {
		
	}
	
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEadder() {
		return eadder;
	}

	public void setEadder(String eadder) {
		this.eadder = eadder;
	}

	public Integer getEno() {
		return eno;
	}

	public void setEno(Integer eno) {
		this.eno = eno;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eadder=" + eadder + ", eno=" + eno + "]";
	}
	
}
