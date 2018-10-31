import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
public class CopyPaste2 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		if (args.length==2) {
			String originFileToCopy = args[0];
			String destinyFileToCopy = args[1];
			BufferedReader br = new BufferedReader(new FileReader(originFileToCopy));
		    BufferedWriter bw = new BufferedWriter(new FileWriter(destinyFileToCopy));
		    bw.write(br.read());
		    br.close();
		    bw.close();
		}
		else {
			System.out.println("Please, enter the path of the file that will be copied and the new file's path.");
		}
	}
}