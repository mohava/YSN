package newHope;

public class EventEnd extends Event {
	private int friendsMod;
	private int knowledgeMod;
	private double sanityMod;
	private double hungerMod;
	private double healthMod;
	public EventEnd(int friendsMod, int knowledgeMod, double sanityMod, double hungerMod, double healthMod) {
		super();
		this.friendsMod = friendsMod;
		this.knowledgeMod = knowledgeMod;
		this.sanityMod = sanityMod;
		this.hungerMod = hungerMod;
		this.healthMod = healthMod;
	}
	public void endEvent(){
		friends+=friendsMod;
		knowledge+=knowledgeMod;
		sanity=Math.min(1.0, sanity+sanityMod);
		hunger=Math.min(1.0, sanity+sanityMod);
		health=Math.min(1.0, health+healthMod);
	}
}
