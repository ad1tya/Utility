/**
 * 
 */
package com.aditya.util;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Aditya Kulkarni This simple date class will be a interface for all
 *         date classes which java programmers need. All the parsing and
 *         formatting of the date will be handles in this class.
 */
public class SimpleDate extends Date implements Comparable<Date> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Date date;

	/**
	 * Initializes the date object with current time.
	 */
	public SimpleDate() {
		// TODO Auto-generated constructor stub
		date = new Date();
	}
	
	public SimpleDate(Date date) {
		this.date = date;
	}

	/**
	 * This function converts the util.Date to sql.Date for direct use.
	 * @return
	 */
	public java.sql.Date toSqlDate() {
		return new java.sql.Date(this.getTime());
	}

	/**
	 * Formats the current date object in "yyyy/MM/dd HH:mm:ss"
	 * 
	 * @return
	 */
	public String getDateInYMS_HMS() {
		return new SimpleDateFormat("\"yyyy/MM/dd HH:mm:ss\"").format(this);
	}

	/**
	 * Converts the current date object to calendar object
	 * @return
	 */
	public Calendar getCalendarObject() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(this);
		return cal;
	}
	
	/**
	 * Converts current date object to LocalDateTime Object.
	 * @return
	 */
	public LocalDateTime getLocalDateTimeObject() {
		LocalDateTime time = LocalDateTime.ofInstant(this.toInstant(), ZoneId.systemDefault());
		return time;
	}
	
}
