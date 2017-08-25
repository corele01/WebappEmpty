package com.ola.webappEmpty.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static String getDate() {
		Date date=new Date();
		return date.getTime()+"";
	}

	public static String formatDate(){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		return format.format(date);
	}
	public static String getDates(){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		return format.format(date);
	}
	public static String getTime(){
		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		Date date = new Date();
		return format.format(date);
	}

	public static boolean find(String date,String minDate,String maxDate){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			long date1 =  format.parse(date).getTime();
			long date2 = format.parse(minDate).getTime();
			long date3 = format.parse(maxDate).getTime();

			if (date1 >= date2 && date1 <= date3){
				return true;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return false;
	}
}
