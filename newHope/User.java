package newHope;

public class User {
	public static boolean isGirl=true;
	public static double age=0;
	public static double friends=0;
	public static double knowledge=0;
	public static double sanity=1.0;
	public static double hunger=1.0;
	public static double health=1.0;

    public double[] parameters;

    public static void setParams(double friendsM, double knowledgeM, double sanityM, double hungerM, double healthM){
		friends+=friendsM;
		knowledge+=knowledgeM;
		sanity=Math.min(1.0, sanity+sanityM);
		hunger=Math.min(1.0, sanity+hungerM);
		health=Math.min(1.0, health+healthM);
	}
}
