public class JadenCase {

	public static void main(String[] args) {
		String result = jadenCase_1("2for   the last week");
		System.out.println(result);
	}

	public static String jadenCase_1(String s) {
		String answer = "";
		String[] groups = s.split(" ");

		for (int i = 0; i < groups.length; i++) {
			String data = groups[i];

			if (groups[i].length() == 0) {
				answer += " ";
			} else {
				answer += data.substring(0, 1).toUpperCase();
				answer += data.substring(1, data.length()).toLowerCase();
				answer += " ";
			}
		}

		if (s.substring(s.length() - 1, s.length()).equals(" ")) {
			return answer;
		}

		return answer.substring(0, answer.length() - 1);
	}
}
