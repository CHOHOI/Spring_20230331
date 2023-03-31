package kr.co.softsoldesk.beans;

public class SoldeskTV implements TV {
	
	public SoldeskTV() {
		System.out.println("===> SoldeskTV 객체 생성");
	}

	@Override
	public void powerOn() {
		System.out.println("SoldeskTV 켜기");
		
	}

	@Override
	public void powerOff() {
		System.out.println("SoldeskTV 전원끄기");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("SoldeskTV 볼륨업");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("SoldeskTV 볼륨 다운");
	}
	
	
	
}
