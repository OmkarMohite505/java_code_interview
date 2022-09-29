package List;

import java.util.stream.IntStream;

public class TestIntStream {

	public static void main(String[] args) {
		IntStream.rangeClosed(1, 10)
		.filter(e -> e % 2 == 0)
		.forEach(e -> System.out.print(e+" "));
	}

}
