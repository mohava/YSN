package newHope;

public class EventStart extends Event {
	private double chance;
	private int friendsIf;
	private int knowledgeIf;
	private double sanityIf;
	private double hungerIf;
	private double healthIf;
	private EventEnd thenEvent;
	public EventStart(double chance, int friendsIf, int knowledgeIf, double sanityIf, double hungerIf, double healthIf,
			EventEnd thenEvent) {
		super();
		this.chance = chance;
		this.friendsIf = friendsIf;
		this.knowledgeIf = knowledgeIf;
		this.sanityIf = sanityIf;
		this.hungerIf = hungerIf;
		this.healthIf = healthIf;
		this.thenEvent = thenEvent;
	}
	public boolean start(){
		if (friends>friendsIf && knowledge>knowledgeIf && sanity>sanityIf && hunger>hungerIf && health>healthIf){
			setStats(-friendsIf, -knowledgeIf, -sanityIf, -hungerIf, -healthIf);
			thenEvent.endEvent();
			return true;
		}
		return false;
	}
}
