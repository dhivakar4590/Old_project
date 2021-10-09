package org.phone;

public class Phone {
	//based on data type
	private void phoneInfo(String s) {
		System.out.println("Phone model is-"+s);
	}
	private void phoneInfo(String s, int i) {
		System.out.println("Phone model and memory is-"+s+" "+i );
	}
	private void phoneInfo(String s, int i, long l, boolean b) {
		System.out.println("Phone model, memory, number, working condition-"+s+" "+i+" "+l+" "+b);
	}
	   public static void main(String[] args) {
    	 Phone p = new Phone();
    	 
    	 p.phoneInfo("iphone");
    	 p.phoneInfo("Samsung");
    	 p.phoneInfo("vivo");
    	 p.phoneInfo("iphone", 68);
    	 p.phoneInfo("Samsung", 128);
    	 p.phoneInfo("vivo", 228);
    	 p.phoneInfo("iphone", 68, 123456, true);
    	 p.phoneInfo("Samsung", 128, 456789, true);
    	 p.phoneInfo("vivo", 228, 789123, true);
 
		
     }
}