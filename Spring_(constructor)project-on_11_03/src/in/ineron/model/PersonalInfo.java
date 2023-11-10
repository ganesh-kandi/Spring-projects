package in.ineron.model;

import java.util.Date;

public class PersonalInfo {
	private long pno;
	private String pname;
	private Date dob;
	private Date doj;
	private Date dom;
	public PersonalInfo(long pno, String pname, Date dob, Date doj, Date dom) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.dob = dob;
		this.doj = doj;
		this.dom = dom;
	}
	@Override
	public String toString() {
		return "PersonalInfo [pno=" + pno + ", pname=" + pname + ", dob=" + dob + ", doj=" + doj + ", dom=" + dom + "]";
	}
	
	
}
