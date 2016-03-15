package newHope;

import javax.swing.JOptionPane;

public class EventWithConditions extends User {
    private double[] minParams;
    private double[] maxParams;
	public Event event;
	public EventWithConditions(double[] minParams, double[] maxParams, Event event) {
		super();
        this.maxParams = maxParams;
        this.minParams = minParams;
		this.event = event;
	}
	public boolean start(){
        if (age>=minParams[0]&&age<=maxParams[0]&&friends>=minParams[1]&&friends<=maxParams[1]&&knowledge>=minParams[2]&&
                knowledge<=maxParams[2]&&sanity>=minParams[3]&&sanity<=maxParams[3]&&hunger>=minParams[4]&&hunger<=maxParams[4]&&
                health>=minParams[5]&&health<=maxParams[5]){
			event.launchEvent();
			return true;
		}
		//JOptionPane.showMessageDialog(null, "Seda s�ndmust ei saa teha", "Title", JOptionPane.INFORMATION_MESSAGE);
		return false;
	}
}
