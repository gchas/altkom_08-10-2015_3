package abstractdemo2;

public class Kwadrat extends AbstractFigura {

	int bok = 9;
	
	public int getBok() {
		return bok;
	}
	
	@Override
	public String getPole() {
		
		return String.valueOf(getBok() * getBok());
	}

	@Override
	public String getObwod() {
		
		return String.valueOf(4 * getBok());
	}

}
