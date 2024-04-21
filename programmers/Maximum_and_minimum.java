public class Maximum_and_minimum {
    public static void main(String[] args) {
		solution("2 1 3 4");
//		solution("-1 -2 -3 -4");
//		solution("-1 -1");
	}

	public static String solution(String s) {
		String answer = "";

		String[] numbers = s.split(" ");
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < numbers.length; i++) {
			int number = Integer.parseInt(numbers[i]);

			min = Math.min(min, number);
			max = Math.max(max, number);
		}
		answer = min + " " + max;

		return answer;
	}

}
