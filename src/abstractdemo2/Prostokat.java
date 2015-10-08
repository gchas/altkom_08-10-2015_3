package abstractdemo2;

public class Prostokat extends AbstractFigura {

	private int krotszyBok = 7;
	private int dluzszyBok = 10;
	
	@Override
	public String getPole() {		
		return String.valueOf(krotszyBok * dluzszyBok);
	}

	@Override
	public String getObwod() {
		return String.valueOf((2 * krotszyBok ) + (2 * dluzszyBok));
	}

}
