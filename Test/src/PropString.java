
public class PropString implements Prop{
	private String name;
	private String value;
	public PropString(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	
}
