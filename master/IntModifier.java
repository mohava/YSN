package master;

public class IntModifier implements Modifier{
	private PropInt myProp; //millist arvu muuta
	private int value; //palju muuta
	public IntModifier(PropInt myProp, int value) {
		super();
		this.myProp = myProp;
		this.value = value;
	}
	public void changeValue(){
		myProp.setValue(myProp.getValue()+value); //l�heb arvu juurde, v�tab praeguse arvu ja liidab muudatuse
	}
}
