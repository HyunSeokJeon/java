package chap11.sec14.exam02_calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExample {
	public static void main(String[] args) {
		// 추상클래스 - 인스턴스 생성불가
		// Calendar cal = new Calendar();
		
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = new GregorianCalendar();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FEBRUARY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		default:
			strWeek = "일";
			
		}
		
		int ampm = cal.get(Calendar.AM_PM);
		String strAmPm = null;
		if(ampm == Calendar.AM) {
			System.out.println("오전");
		} else {
			System.out.println("오후");
		}
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year + "년");
		System.out.println(month + "월");
		System.out.println(day + "일");
		System.out.println(strWeek + "요일");
		System.out.println(strAmPm + "");
		
		System.out.println(hour + "시");
		System.out.println(minute + "분");
		System.out.println(second + "초");
		
	}
}
