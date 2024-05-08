package org.lessons.java.inheritance;

public class Main {

	public static void main(String[] args) {
		Smartphone iphone15 = new Smartphone(0, "iphone15", "Apple", 786.76, 0.2, 0, 32);
		
		iphone15.creaProdotto();
		
		System.out.println(" ");
		
		Televisore televisore1 = new Televisore (0, "HDTV4", "Samsung", 400.54, 0.2, 0, false);
		
		televisore1.creaProdotto();
		
		System.out.println(" ");
		
		Cuffie cuffie1 = new Cuffie(0, "PureAudio", "JBL", 100.00, 0.2, "Nero", false);
		
		cuffie1.creaProdotto();
	}

}
