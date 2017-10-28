package com.deep.corp.bean;

import java.util.concurrent.atomic.AtomicLong;

public class CalendarDays {

	private String today;
	
	public CalendarDays(AtomicLong num){
		if(num.intValue()%2==0){
			today="Wednesday";
		}else
			today="Thursday";
	}

	public String getToday() {
		return today;
	}

	public void setToday(String today) {
		this.today = today;
	}
	
	
}
