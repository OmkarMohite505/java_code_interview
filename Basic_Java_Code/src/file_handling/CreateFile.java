package file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CreateFile {

	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("abc.txt");
		File file = new File("hello.txt");
		
		System.out.println(file.getAbsolutePath());
//		System.out.println(file.getPath());
		System.out.println(System.getProperty("os.name"));
		System.getProperties().list(System.out);
	}

}
