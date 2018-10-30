import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
public class CopyPast {
	public static void main(String[] args)  throws FileNotFoundException {
		// TODO Auto-generated method stub
		if (args.length==2) {
			String copyFile=args[0];
			String pasteFile=args[1];
			Scanner sc2 = new Scanner(args[0]);
			String surnames = sc2.nextLine();
		    BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
		    writer.write();
		     
		    writer.close();
		    sc2.close();
		}
	}
}
