package serializabledemo;

import java.io.Serializable;

public class Car implements Serializable {

	private static final long serialVersionUID = 123L;
	
	private String marka;
	
	private transient String kolor;

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getKolor() {
		return kolor;
	}

	public void setKolor(String kolor) {
		this.kolor = kolor;
	}	
}