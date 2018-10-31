import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
public class CopyPast {
	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
		if (args.length==2) {
			File originFileToCopy= new File(args[0]);
			File destinyFileToCopy=new File(args[1]);
			Scanner sc2 = new Scanner(originFileToCopy);
		    BufferedWriter writer = new BufferedWriter(new FileWriter(destinyFileToCopy));
			while (sc2.hasNext()) {
			    writer.write(sc2.nextLine());
			    writer.newLine();
			}
		    writer.close();
		    sc2.close();
		}
		else {
			System.out.println("Please, enter the path of the file that will be copied and the new file's path.");
		}
	}
}