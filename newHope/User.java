package newHope;

public class User {
	public static double age=0;
	public static double friends=0;
	public static double knowledge=0;
	public static double money=0;
	public static double sanity=1.0;
	public static double hunger=1.0;
	public static double health=1.0;

    public double[] parameters;
    
    public static void reset(){
    	age=0;
    	friends=0;
    	knowledge=0;
    	money=0;
    	sanity=1.0;
    	hunger=1.0;
    	health=1.0;
    }
    
    public static void setParams(double friendsM, double knowledgeM, double sanityM, double hungerM, double healthM){
		friends+=friendsM;
		knowledge+=knowledgeM;
		sanity=Math.min(1.0, sanity+sanityM);
		hunger=Math.min(1.0, sanity+hungerM);
		health=Math.min(1.0, health+healthM);
	}
}
