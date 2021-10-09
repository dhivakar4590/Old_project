package org.phone;

public class InternalStorage extends ExternalStorage {
	
	public void processorName() {
		System.out.println("ios");
	}	
	public void ramSize() {
		System.out.println("8GB");
		
	}


	public static void main(String[] args) {
		InternalStorage i = new InternalStorage();
		
		i.processorName();
		i.ramSize();
		i.size();

	}

}
