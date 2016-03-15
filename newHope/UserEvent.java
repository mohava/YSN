package newHope;

public class UserEvent extends User {
	private double ageMod;
	private double friendsMod;
	private double knowledgeMod;
	private double sanityMod;
	private double hungerMod;
	private double healthMod;
    public String eventName;

	public UserEvent(double[] modParameters, String eventName) {
		super();
        this.ageMod = modParameters[0];
		this.friendsMod = modParameters[1];
		this.knowledgeMod = modParameters[2];
		this.sanityMod = modParameters[3];
		this.hungerMod = modParameters[4];
		this.healthMod = modParameters[5];
        this.eventName = eventName;
	}
	public void launchEvent(){

        age += ageMod;
        friends+=friendsMod;
		knowledge+=knowledgeMod;
		sanity=Math.min(1.0, sanity+sanityMod);
		hunger=Math.min(1.0, hunger+hungerMod);
		health=Math.min(1.0, health+healthMod);
	}
}
