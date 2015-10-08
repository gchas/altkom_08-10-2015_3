package abstractdemo2;

public abstract class AbstractFigura {

	public abstract String getPole();
	
	public abstract String getObwod();
	
	public void showInfo() {
		
		System.out.println("Pole: " + getPole());
		System.out.println("Obwod: " + getObwod());		
	}
	
}
