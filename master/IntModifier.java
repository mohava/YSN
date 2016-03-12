package master;

public class IntModifier implements Modifier{
	private PropInt myProp; //millist arvu muuta
	private int value; //palju muuta
	private Req[] reqs;
	
	public IntModifier(PropInt myProp, int value, Req[] reqs) {
		super();
		this.myProp = myProp;
		this.value = value;
		this.reqs = reqs;
	}
	
	public IntModifier(PropInt myProp, int value) {
		super();
		this.myProp = myProp;
		this.value = value;
		reqs = new Req[]{};
	}

	public void changeValue(){
		boolean c = true;
		for (Req r: reqs)
			if (!r.canChange()){
				c=false;
				break;
			}
		if (c){
			for (Req r: reqs)
				r.change();			
			myProp.setValue(myProp.getValue()+value); //läheb arvu juurde, võtab praeguse arvu ja liidab muudatuse
		}
	}
}
