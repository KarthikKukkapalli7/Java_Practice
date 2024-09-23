import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileReading {
	
	public static void main(String[] args) {
		
		
		
		try {
			
			File file = new File("D:\\Java EE\\java\\File.txt");
			
			Scanner readdata = new Scanner(file);
			
			while(readdata.hasNextLine()) {
				System.out.println(readdata.nextLine());
			}
			readdata.close();
			
		} catch (FileNotFoundException e) {
		System.out.println("An exception occured");
			e.printStackTrace();
		}
		
		
		
	}

}
