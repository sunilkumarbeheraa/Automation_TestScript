package test.muvi6.com;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class AllStringPractice
{

	
	public static void main(String[] args) {
		
		String s="Next Billing date: October 23, 2018";
		String replace=s.replace("Next Billing date: ", "");
		System.out.println(replace);
		
		
		
		
		
		
		
		Date current = new Date();
		String strDate;
		DateFormat dateFormat;
		Calendar cal = Calendar.getInstance();
		cal.setTime(current);
		cal.set(Calendar.MONTH, (cal.get(Calendar.MONTH)));
		current = cal.getTime();
		dateFormat=DateFormat.getDateInstance(DateFormat.MEDIUM);
		strDate=dateFormat.format(current);
		System.out.println(strDate);
		
		
	
		
		
		/*Date today;
		String strDate;
		DateFormat dateFormat;
		dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
		today = new Date();
		
		
		strDate = dateFormat.format(today);
		System.out.println(strDate);*/
		
		
		DateFormat dateFormat1 = new SimpleDateFormat("MM/dd/YYYY");
		Calendar callender = Calendar.getInstance();
		String nameNew=dateFormat1.format(callender.getTime());
		System.out.println(nameNew);
		
		
		
		
				
	}
	
	
}
