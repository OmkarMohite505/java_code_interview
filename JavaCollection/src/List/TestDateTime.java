package List;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;

public class TestDateTime {

	public static void main(String[] args) throws InterruptedException {
		LocalDateTime time = LocalDateTime.now();
		String s = time.toString();
		System.out.println(s);
		String[] arr = s.split("T");
		Arrays.stream(arr).forEach(System.out::println);
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		Thread.sleep(36001);
		if(LocalDateTime.now().isBefore(time.plusMinutes(1)))
			System.out.println("Yes");
		LocalDate date = LocalDate.now();
		
	}

}
