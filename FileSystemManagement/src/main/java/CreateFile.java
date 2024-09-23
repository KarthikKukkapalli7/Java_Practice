import java.io.File;
import java.io.IOException;




public class CreateFile {
	
	
	public static void main(String[] args) {
		File fo = new File("D:\\Java EE\\java\\File.txt");
		try {
			if(fo.createNewFile()) {
				System.out.println(fo.getName());
				System.out.println(fo.getAbsolutePath());
				System.out.println(fo.getAbsoluteFile());
				System.out.println(fo.getUsableSpace());
				System.out.println(fo.getTotalSpace());
				System.out.println(fo.canRead());
				System.out.println(fo.canWrite());
				System.out.println(fo.length());
				
				
				
			}else {
				System.out.print("File already exits");
			}
		} catch (IOException e) {
			System.out.println("an unexpected error occurred");
			e.printStackTrace();
		}
	}

}
