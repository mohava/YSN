package master;

import javax.swing.JOptionPane;

public class Req {
	private PropInt myProp;
	private int value;
	public Req(PropInt myProp, int value) {
		super();
		this.myProp = myProp;
		this.value = value;
	}
	public boolean canChange(){
		if (myProp.getValue()<value){
			JOptionPane.showMessageDialog(null, "Puuduv " + myProp.getName(), "Title", JOptionPane.INFORMATION_MESSAGE);
			return false;
		}
		return true;
	}
	public void change(){
		myProp.setValue(myProp.getValue()-value);
	}
}
