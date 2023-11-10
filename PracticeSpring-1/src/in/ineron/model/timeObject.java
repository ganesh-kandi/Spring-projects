package in.ineron.model;

import java.util.Date;

public class timeObject {
	
	private Date date;

	
	
	public timeObject(Date date) {
		System.out.println("constructor is used");
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

}
