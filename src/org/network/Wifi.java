package org.network;

public class Wifi extends MobileData {

	public void WifiName() {
		System.out.println("Jio");
	}
	public static void main(String[] args) {
		
		Wifi w = new Wifi();
		
		w.WifiName();
		w.DataName();
		w.lanName();
		w.modamName();

	}

}
