package file_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CreateNewTextFile {

	public static void main(String[] args) throws IOException {
		File file = new File("input.txt");
		file.createNewFile();
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(System.getProperty("user.dir"));
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str;
		while((str = br.readLine())!= null) {
			System.out.println(str);
		}
	}

}
