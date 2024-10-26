package java1;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Demofile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("filiename.txt");
			
		if(!file.exists()) {
			file.createNewFile();
		}
		PrintWriter pw = new PrintWriter(file);
		pw.println("shcgdhjvhfkdhk");
		pw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		}
}

