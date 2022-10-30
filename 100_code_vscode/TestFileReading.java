import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReading {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("hello.txt"));

        String line;
        while((line = reader.readLine()) != null){
            System.out.println(line);
        }
        reader.close();
    }
}
