public class Maximum_and_minimum {
    public static void main(String[] args) {
//		getMinMaxString_1("2 1 3 4");
//		getMinMaxString_1("-1 -2 -3 -4");
//		getMinMaxString_1("-1 -1");

		getMinMaxString_2("2 1 3 4");
	}

	public static String getMinMaxString_1(String str) {
		String[] numbers = str.split(" ");
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < numbers.length; i++) {
			int number = Integer.parseInt(numbers[i]);

			min = Math.min(min, number);
			max = Math.max(max, number);
		}
		return min + " " + max;
	}

	public static String getMinMaxString_2(String str) {
		String[] numbers = str.split(" ");
		int min, max, n;
		min = max = Integer.parseInt(numbers[0]);

		for (int i = 1; i < numbers.length; i++) {
			n = Integer.parseInt(numbers[i]);

			if (min > n)
				min = n;
			if (max < n)
				max = n;
		}

		return min + " " + max;
	}

}
