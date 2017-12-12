package com._520it_04;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Test1 {
	public static void main(String[] args) throws ParseException {		
		String date1 = "2000-12-23";
		String date2 = "2015-12-24";
		long diff = diffDay(date1, date2);
		System.out.println(diff);
	
		
	}	
	static long diffDay(String first,String second) throws ParseException{

		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date firstDay = sf.parse(first);
		Date secondDay = sf.parse(second);
		long diff = (firstDay.getTime()-secondDay.getTime())/(1000 * 60 * 60 * 24);
		return Math.abs(diff);
	}
}
