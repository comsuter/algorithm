public class ConvertStringToInteger {

	public static void main(String[] args) {
//		int result = convertStringToInteger_1("1234");
		int result = convertStringToInteger_2("1234");
		System.out.println(result);
	}

	public static int convertStringToInteger_1(String s) {
		int result = 0;
		boolean isNegative = false;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == '-') {
				isNegative = true;
			} else if (c == '+') {
				// 
			} else {
				result = result * 10 + (c - '0');
			}

		}
		return isNegative ? -result : result;
	}
	
	public static int convertStringToInteger_2(String s) {
		int result = 0;
		boolean isNegative = false;
		
		if (s.length() > 0) {
			char firstChar = s.charAt(0);
			if (firstChar == '-') {
				isNegative = true;
			}
		}

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (c != '-' && c != '+') {
				result = result * 10 + (c - '0');
			}

		}
		return isNegative ? -result : result;
	}
}