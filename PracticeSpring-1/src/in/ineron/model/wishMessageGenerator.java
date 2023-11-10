package in.ineron.model;


public class wishMessageGenerator {
	
	private timeObject time;

	private timeObject date;
	

	public timeObject getTime() {
		return time;
	}


	public void setTime(timeObject time) {
		this.time = time;
	}


	public timeObject getDate() {
		return date;
	}


	public void setDate(timeObject date) {
		this.date = date;
	}


	public String generateWishMessage(String name) {
		
		
//		time.setTime(20);
//		//date.setDate("asd");
//		
//		int hours=time.getTime();
//		if(hours<=12)
//			return "Good morning "+name;
//		else if(hours<=16)
//			return "Good noon "+name;
//		else if(hours<=19)
//			return "Good evening "+name;
//		else 
			return "Good night "+name;
		
	}
}
