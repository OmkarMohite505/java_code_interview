class CountNumber {

	static int CountNumber(Integer n) {

		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println(CountNumber(1123456789));
	}

}