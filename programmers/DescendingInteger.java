import java.util.Arrays;

public class DescendingInteger {
    
    public static void main(String[] args) {
		descendingInteger(8000013060L);
	}

	public static long descendingInteger(long n) {
		char[] charArr = Long.toString(n).toCharArray();

		Arrays.sort(charArr);

		StringBuilder sb = new StringBuilder(new String(charArr)).reverse();

		return Long.parseLong(sb.toString());
	}

	static String res = "";

	public static long descendingInteger_2(long n) {
		Long.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
		return Long.parseLong(res);
	}

}
