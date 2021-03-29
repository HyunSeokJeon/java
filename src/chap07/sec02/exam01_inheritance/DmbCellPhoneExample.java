package chap07.sec02.exam01_inheritance;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		// DmbCellPhone 객체 생성
		DmbCellPhone dmb = new DmbCellPhone("자바폰", "검정", 10);
		
		// CellPhone으로부터 상속 받은 필드
		System.out.println("모델: " + dmb.model);
		System.out.println("색깔: " + dmb.color);
		
		// DmbCellPhone의 필드
		System.out.println("채널: " + dmb.channel);
		
		// CellPhone으로부터 물려받은 메소드 호출
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("여보세요");
		dmb.recieveVoice("안녕하세요!");
		dmb.sendVoice("좋은아침!");
		dmb.hangUp();
		
		// DmbCellPhone의 메소드 호출
		dmb.turnOnDmb();
		dmb.changeChannel(12);
		dmb.turnOffDmb();
		
		
		
		
		
		
	}
}
