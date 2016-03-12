package master;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Event {
	private String name; //faili poolt antud nimi, et saaks siduda
	private JTextArea ta; //lihtsalt tekst
	private double chance; //kui suure võimalus, et juhtub
	private Object[] options; //millised valikud on
	private Modifier[] modifiers; //valikutele vastavad muutuste tegijad
	
	public Event(String name, JTextArea ta, double chance, Object[] options, Modifier[] modifiers) {
		super();
		this.name = name;
		this.ta = ta;
		this.ta.setEditable(false); //TextArea on muidu kasutaja poolt muudetav
		this.ta.setOpaque(false); //TextArea on muidu valge taustaga
		this.chance = chance;
		this.options = options;
		this.modifiers = modifiers;
	}
	public Event(String name, String sss, double chance, Object[] options, Modifier[] modifiers) {
		super();
		this.name = name;
		this.ta = new JTextArea(sss); //et saaks stringi sisse panna
		this.ta.setEditable(false);
		this.ta.setOpaque(false);
		this.chance = chance;
		this.options = options;
		this.modifiers = modifiers;
	}
	public String getName() {
		return name; //for loopiga õige nime leidmiseks, jällegi sidumise jaoks
	}
	public double getChance() {
		return chance;
	}
	public void doEvent(){
		int a = JOptionPane.showOptionDialog(null, ta , "Title", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
		//küsib kasutajalt, salvestab vastuse (mis on number)
		if (a!=-1) //äkki kasutaja pani hoopis kinni
			modifiers[a].changeValue(); //võtab masiivist muutuse isendi ja teeb muudatuse
	}
}