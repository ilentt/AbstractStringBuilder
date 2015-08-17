package ilentt.ilenlab.com.abstractstringbuilder;

public class Immutable {
	
	private String strName;
	private int iValue;
	
	public Immutable(String name, int value) {
		this.strName = name;
		this.iValue = value;
	}
	
	public String getName() {
		return this.strName;
	}
	
	public int getValue() {
		return this.iValue;
	}
}
