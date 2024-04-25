import java.util.Stack;

public class CorrectParentheses {

	public static void main(String[] args) {
		correctParentheses_1("(())()");
	}

	public static boolean correctParentheses_1(String str) {
		boolean answer = true;

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			// 여는 괄호일 때
			if (c == '(') {
				stack.push(c);
			}

			// 닫는 괄호일 때
			if (c == ')') {
				if (stack.size() > 0) {
					stack.pop();
				} else {
					return false;
				}
			}
		}

		if (stack.size() != 0) {
			answer = false;
		}
		return answer;
	}

	public static boolean correctParentheses_2(String str) {
		boolean answer = true;

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c == '(') {
				count++;
			}

			if (c == ')') {
				count--;
			}

			if (count < 0) {
				answer = false;
			}
		}
		return answer;
	}
}