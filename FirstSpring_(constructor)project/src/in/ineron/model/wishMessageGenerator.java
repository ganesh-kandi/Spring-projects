package in.ineron.model;

import java.util.Date;

public class wishMessageGenerator {
	private Date date;

	public wishMessageGenerator(Date date) {
		System.out.println("constructor is called");
		this.date = date;
	}

	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}

	public String generateWishMessage(String name) {
		System.out.println("date is ::"+getDate());
		
		int hours=date.getHours();
		if(hours<=12)
			return "Good morning "+name;
		else if(hours<=16)
			return "Good noon "+name;
		else if(hours<=19)
			return "Good evening "+name;
		else 
			return "Good night "+name;
		
	}
}
