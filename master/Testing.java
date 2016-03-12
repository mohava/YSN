package master;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Testing {
	public static void main(String[] args) throws FileNotFoundException{
		File file = new File(System.getProperty("user.dir")+"\\testfile.txt");
		Scanner sc= new Scanner(file, "UTF-8");
		while (sc.hasNextLine())
			System.out.println(sc.nextLine());
		sc.close();
		PropInt int1 = new PropInt("Test1",1); //teeb muutedava arvu, millel on kindel nimi sidumise jaoks
		PropInt int2 = new PropInt("Test2",2); 
		Event testevent = new Event("Test event","test event text area",0,new Object[]{"test0","test1"},new IntModifier[]{new IntModifier(int1,1),new IntModifier(int2,-2)});
		testevent.doEvent();
		System.out.println(int1.getValue()+" - "+int2.getValue());
	}
}
