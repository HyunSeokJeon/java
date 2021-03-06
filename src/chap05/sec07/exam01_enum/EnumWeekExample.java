package chap05.sec07.exam01_enum;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		Week today = null;
		
		// Calendar 클래스 타입의 cal 변수에 Calendar 객체를 생성하여 대입한다.
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}

		System.out.println(today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		}else {
			System.out.println("열심히 자바공부합니다.");
		}
		Week[] days = Week.values();
			
	}
}
