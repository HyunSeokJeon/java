package chap11.sec14.exam02_calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExample {
	public static void main(String[] args) {
		// �߻�Ŭ���� - �ν��Ͻ� �����Ұ�
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
			strWeek = "��";
			break;
		case Calendar.TUESDAY:
			strWeek = "ȭ";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "��";
			break;
		case Calendar.THURSDAY:
			strWeek = "��";
			break;
		case Calendar.FEBRUARY:
			strWeek = "��";
			break;
		case Calendar.SATURDAY:
			strWeek = "��";
			break;
		default:
			strWeek = "��";
			
		}
		
		int ampm = cal.get(Calendar.AM_PM);
		String strAmPm = null;
		if(ampm == Calendar.AM) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year + "��");
		System.out.println(month + "��");
		System.out.println(day + "��");
		System.out.println(strWeek + "����");
		System.out.println(strAmPm + "");
		
		System.out.println(hour + "��");
		System.out.println(minute + "��");
		System.out.println(second + "��");
		
	}
}
