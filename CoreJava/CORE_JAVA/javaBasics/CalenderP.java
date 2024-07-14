package com.javaBasics;

import java.util.Calendar;

public class CalenderP {
public static void main(String[] args) {
	Calendar cal=Calendar.getInstance();
	//c.setTime(today);
	//int dayOfYear=c.get(Calendar.DAY_OF_YEAR);
	for(int i=1;i<=12;i++) {
	cal.add(Calendar.DATE,30);
	System.out.println(cal.getTime());

	}
}
}
