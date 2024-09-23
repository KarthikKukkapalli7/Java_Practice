
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
	
	public static void main(String[] args) {
		
		try (FileWriter fileWriter = new FileWriter("D:\\Java EE\\java\\File.txt")) {
			
			fileWriter.write("Hii file management in java");
			fileWriter.write("Hii file management in java");
			fileWriter.write("Hii file management in java \n");
			fileWriter.write("Hii file management in java");
			fileWriter.write("Hii file management in java");
			fileWriter.write("Hii file management in java");
			fileWriter.close();
			
			System.out.println("Content is successfully wrote to the file."); 
			
		} catch (IOException e) {
			
			System.out.println("Unexpected error occurred");
			
			e.printStackTrace();
		}
		
		
	}

}
