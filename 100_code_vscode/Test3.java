import java.time.LocalDate;
import java.time.Month;

public class Test3 {
    public static void main(String[] args) {
        LocalDate startLocalDate = LocalDate.of(2018, Month.MAY, 29);

        startLocalDate = startLocalDate.plusMonths(9);

        startLocalDate = startLocalDate.plusDays(4);

        System.out.println(startLocalDate.getDayOfYear());
    }
}
