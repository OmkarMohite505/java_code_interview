package optional;

import java.util.Optional;

public class OptionalString {

	public static void main(String[] args) {
		String str = "Hello";
		Optional<String> opt = Optional.ofNullable(str);
		System.out.println(opt.get());
		String str2 = null;
		Optional<String> opt2 = Optional.ofNullable(str2);
		if(opt2.isPresent())
		System.out.println(opt2.get());
		else
			System.out.println("Value is null");
		if(! opt2.isPresent()) {
			str2 = opt2.orElse("Default");
			System.out.println(str2);
		}
	}

}
