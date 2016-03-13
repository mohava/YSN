package newHope;

public class Event {
	public static boolean isGirl;
	public static int age;
	public static int friends;
	public static int knowledge;
	public static double sanity;
	public static double hunger;
	public static double health;
	public static void setStats(int friendsM, int knowledgeM, double sanityM, double hungerM, double healthM){
		friends+=friendsM;
		knowledge+=knowledgeM;
		sanity=Math.min(1.0, sanity+sanityM);
		hunger=Math.min(1.0, sanity+sanityM);
		health=Math.min(1.0, health+healthM);
	}
}
