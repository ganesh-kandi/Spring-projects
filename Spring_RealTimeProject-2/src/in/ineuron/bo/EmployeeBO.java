package in.ineuron.bo;

public class EmployeeBO {
	private Integer eid;
	private String ename;
	private Integer eage;
	private String eadder;
	
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Integer getEage() {
		return eage;
	}

	public void setEage(Integer eage) {
		this.eage = eage;
	}

	public String getEadder() {
		return eadder;
	}

	public void setEadder(String eadder) {
		this.eadder = eadder;
	}

	@Override
	public String toString() {
		return "EmployeeBO [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", eadder=" + eadder + "]";
	}
	
	
}
