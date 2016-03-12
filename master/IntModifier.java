package master;

public class IntModifier {
	private PropInt myProp;
	private int value;
	public IntModifier(PropInt myProp, int value) {
		super();
		this.myProp = myProp;
		this.value = value;
	}
	public void changeValue(){
		myProp.setValue(myProp.getValue()+value);
	}
}
