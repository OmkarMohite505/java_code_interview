import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWrite {
    public static void main(String[] args) throws IOException {
        File file = new File("hello.txt");
        FileWriter fw = new FileWriter(file);
        fw.write("Today is 23 Ocrober");
        fw.write("Diwali Festival is now");
        fw.close();
        BufferedWriter writer = new BufferedWriter(new FileWriter("hello.txt"));
        writer.write("Writing through Buffered Writer");
        writer.write("\nTHis is Second Line");
        writer.close();
    }
}
