public class JadenCase {

	public static void main(String[] args) {
		String result = jadenCase_1("2for   the last week");
		System.out.println(result);
	}

	public static String jadenCase_1(String s) {
		String answer = "";
		String[] groups = s.toLowerCase().split("");
		boolean isFirst = true;
	
		for (String str : groups) {
			answer += isFirst ? str.toUpperCase() : str;
			isFirst = " ".equals(str) ? true : false;
		}
		return answer;
	}
}
