package newHope;

import javax.swing.JOptionPane;

public class EventStart extends Event {
	private int friendsIf;
	private int knowledgeIf;
	private double sanityIf;
	private double hungerIf;
	private double healthIf;
	private EventEnd thenEvent;
	public EventStart(int friendsIf, int knowledgeIf, double sanityIf, double hungerIf, double healthIf,
			EventEnd thenEvent) {
		super();
		this.friendsIf = friendsIf;
		this.knowledgeIf = knowledgeIf;
		this.sanityIf = sanityIf;
		this.hungerIf = hungerIf;
		this.healthIf = healthIf;
		this.thenEvent = thenEvent;
	}
	public boolean start(){
		if (friends>=friendsIf && knowledge>=knowledgeIf && sanity>=sanityIf && hunger>=hungerIf && health>=healthIf){
			thenEvent.end();
			return true;
		}
		JOptionPane.showMessageDialog(null, "Seda sündmust ei saa teha", "Title", JOptionPane.INFORMATION_MESSAGE);
		return false;
	}
}
