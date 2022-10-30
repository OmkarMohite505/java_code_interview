import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test6 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("a", "b", "cd", "ef", "ghij");

        Map<Integer, String> data = names.stream().collect(Collectors.groupingBy(String::length,

                Collectors.joining()));

        System.out.println(data.values());
    }
}
