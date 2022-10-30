package file_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
//		FileOutputStream fos = new FileOutputStream("abc.txt");
//		File file = new File("abc.txt");
		File file = new File(System.getProperty("user.dir")+File.separator+"abc.txt");
		
//		System.out.println(file.getAbsolutePath());
		 BufferedReader br
         = new BufferedReader(new FileReader(file));

     // Declaring a string variable
     String st;
     // Condition holds true till
     // there is character in a string
     while ((st = br.readLine()) != null)
     {
         // Print the string
    	 String temp = st.stripTrailing();
    	 if(temp.length() == 28)
         System.out.println(temp);
     }
//		System.out.println(file.getPath());
//		System.out.println(System.getProperty("os.name"));
//		System.getProperties().list(System.out);
	}

}
