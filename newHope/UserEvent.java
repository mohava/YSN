package newHope;

public class UserEvent extends User {
	private double ageMod;
	private double friendsMod;
	private double knowledgeMod;
	private double moneyMod;
	private double sanityMod;
	private double hungerMod;
	private double healthMod;
    public String eventName;

	public UserEvent(double[] modParameters, String eventName) {
		super();
        this.ageMod = modParameters[0];
		this.friendsMod = modParameters[1];
		this.knowledgeMod = modParameters[2];
		this.moneyMod = modParameters[3];
		this.sanityMod = modParameters[4];
		this.hungerMod = modParameters[5];
		this.healthMod = modParameters[6];
        this.eventName = eventName;
	}
	public void launchEvent(){
        age += ageMod;
        friends+=friendsMod;
		knowledge+=	(Math.random()*0.2+0.9)*knowledgeMod;
		money+=(Math.random()*0.2+0.9)*moneyMod;
		sanity=Math.min(1.0, sanity+(Math.random()*0.2+0.9)*sanityMod);
		hunger=Math.min(1.0, hunger+(Math.random()*0.2+0.9)*hungerMod);
		health=Math.min(1.0, health+(Math.random()*0.2+0.9)*healthMod);
	}
}
