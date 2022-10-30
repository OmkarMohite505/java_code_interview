import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main{
    public static void main(String[] args)throws Exception{
    String path = System.getProperty("user.dir")+File.separator+"input.txt";
    File file = new File(path);
    BufferedReader br
    = new BufferedReader(new FileReader(file));
    String st;
    while((st = br.readLine()) != null){
    String temp = st.stripTrailing();
    if(temp.length() == 28){
    System.out.println(temp);
    }
    br.close();
    
    }
    
    
    
    }
    }