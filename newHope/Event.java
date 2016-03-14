package newHope;

public class Event {
	public static boolean isGirl=true;
	public static int age=0;
	public static int friends=0;
	public static int knowledge=0;
	public static double sanity=1.0;
	public static double hunger=1.0;
	public static double health=1.0;
	public static void setStats(int friendsM, int knowledgeM, double sanityM, double hungerM, double healthM){
		friends+=friendsM;
		knowledge+=knowledgeM;
		sanity=Math.min(1.0, sanity+sanityM);
		hunger=Math.min(1.0, sanity+sanityM);
		health=Math.min(1.0, health+healthM);
	}
}
