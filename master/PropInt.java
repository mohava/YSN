package master;

public class PropInt implements Prop{
	private String name;
	private int value;
	public PropInt(String name, int value) {
		super();
		this.name = name;
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
}
