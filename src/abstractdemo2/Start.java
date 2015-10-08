package abstractdemo2;

public class Start {

	public static void main(String[] args) {

		AbstractFigura f1 = new Prostokat();
		AbstractFigura f2 = new Kwadrat();

		Kwadrat kw = (Kwadrat)f2;
		
		System.out.println("Bok kw: " + kw.getBok());
		
		f1.showInfo();
		kw.showInfo();
	}

}
