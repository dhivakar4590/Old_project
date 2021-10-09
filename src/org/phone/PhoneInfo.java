package org.phone;

public class PhoneInfo {
	
	public void phoneName() {
		System.out.println("I phone11");
	}
	public void phoneMieiNum() {
		System.out.println("123456");
	}
	public void Camera() {
		System.out.println("15mp");
	}
	public void storage() {
		System.out.println("64Gb");
	}
	public void osName() {
		System.out.print("ios");
	}

	public static void main(String[] args) {
		PhoneInfo p = new PhoneInfo();
		
		p.phoneName();
		p.phoneMieiNum();
		p.Camera();
		p.storage();
		p.osName();
		

	}

}
