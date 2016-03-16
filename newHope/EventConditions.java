package newHope;

public class EventConditions extends User {
    private double[] minParams;
    private double[] maxParams;
	public UserEvent event;
	public EventConditions(double[] minParams, double[] maxParams, UserEvent event) {
		super();
        this.maxParams = maxParams;
        this.minParams = minParams;
		this.event = event;
	}
    public boolean check(){
        return age>=minParams[0]&&age<=maxParams[0]&&friends>=minParams[1]&&friends<=maxParams[1]&&knowledge>=minParams[2]&&
                knowledge<=maxParams[2]&&money>=minParams[3]&&money<=maxParams[3]&&sanity>=minParams[4]&&sanity<=maxParams[4]&&hunger>=minParams[5]&&hunger<=maxParams[5]&&
                health>=minParams[6]&&health<=maxParams[6];
    }

	public boolean start(){
        if (check()){
			event.launchEvent();
			return true;
		}
		//JOptionPane.showMessageDialog(null, "Seda s�ndmust ei saa teha", "Title", JOptionPane.INFORMATION_MESSAGE);
		return false;
	}
}
