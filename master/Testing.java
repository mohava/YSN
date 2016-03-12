package master;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by ATM on 12/03/2016.
 */
//MIHKEL TESTIB
//hOI, im temmie -LE
public class Testing {
	public static void main(String[] args) throws FileNotFoundException{
		File file = new File(System.getProperty("user.dir")+"\\testfile.txt");
		Scanner sc= new Scanner(file, "UTF-8");
		while (sc.hasNextLine())
			System.out.println(sc.nextLine());
		sc.close();
	}
}
