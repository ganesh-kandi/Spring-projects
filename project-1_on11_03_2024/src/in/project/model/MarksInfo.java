package in.project.model;

import java.util.Date;
import java.util.List;

public class MarksInfo {
	private List<String> nameList;
	private List<Date> dateList;

	static {
		System.out.println("MarksInfo.class file is loading...");
	}

	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}

	public void setDateList(List<Date> dateList) {
		this.dateList = dateList;
	}

	public MarksInfo(List<String> nameList, List<Date> dateList) {
		super();
		this.nameList = nameList;
		this.dateList = dateList;
	}

}
