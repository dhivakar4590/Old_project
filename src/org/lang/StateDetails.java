package org.lang;

public class StateDetails extends LanguageInfo {
	
	public void southIndia() {
		System.out.println("Tamilnadu");
		System.out.println("Kerala");
		System.out.println("Andrapradesh");
		System.out.println("Telangana");
		System.out.println("Karnataka");
	}
	
	public void northIndia() {
		System.out.println("UP");
		System.out.println("Delhi");
		System.out.println("Punjab");
		System.out.println("Haryana");
		System.out.println("Rajasthan");
	}

	public static void main(String[] args) {
		StateDetails s = new StateDetails();
		
		s.southIndia();
		s.northIndia();
		s.tamilLanguage();
		s.englishLanguage();
		s.hindiLanguage();


	}

}
