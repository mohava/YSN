package master;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Event {
	private String name;
	private JTextArea ta;
	private double chance;
	private Object[] options;
	private IntModifier[] modifiers;
	
	public Event(String name, JTextArea ta, double chance, Object[] options, IntModifier[] modifiers) {
		super();
		this.name = name;
		this.ta = ta;
		this.ta.setEditable(false);
		this.ta.setOpaque(false);
		this.chance = chance;
		this.options = options;
		this.modifiers = modifiers;
	}
	public String getName() {
		return name;
	}
	public double getChance() {
		return chance;
	}
	public void doEvent(){
		
		int a = JOptionPane.showOptionDialog(null, ta , "yes", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
		modifiers[a].changeValue();
	}
}