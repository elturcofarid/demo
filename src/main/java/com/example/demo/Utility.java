package com.example.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.example.demo.constants.ConstApi;



public class Utility {
	
	private Utility() {
		super();
	}
	
	public static Date convertStringToDate(String dateConvert) {
		if (dateConvert != null) {
			try {
				String format = ConstApi.DATE_FORMAT;
				return new SimpleDateFormat(format).parse(dateConvert);		
				
			} catch (Exception e) {
				 e.printStackTrace();
				 return null;
			}
		} else {
			return null;
		}
	}
	
	public static String convertDateToString(Date dateConvert) {
		if (dateConvert != null) {
			String format = ConstApi.DATE_FORMAT;
			DateFormat dateFormat = new SimpleDateFormat(format);  
			return dateFormat.format(dateConvert);
		} else {
			return null;
		}
	}
	
	public static String formatDate(Date date) {
		SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
        return dt1.format(date);
	}
	
	public static String formatDateFile(Date date) {
		SimpleDateFormat dt1 = new SimpleDateFormat("dd-MM-yyyy");
        return dt1.format(date);
	}
	
	public static String formatValueFile(double value) {
        return  String.format("%.2f", value).replace(",", ".");
	}

}
