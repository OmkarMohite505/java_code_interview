import java.util.ArrayList;
import java.util.List;

class Test22{
    public int value;
    public int hashCode(){
        return (int)(value ^ 5);
    }
}

public class Test9 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        List<? extends Number> numbers = process(list);
        
    }

    public static <T extends Number> List<T> process(List<T> args){
        return null;
    }
}
