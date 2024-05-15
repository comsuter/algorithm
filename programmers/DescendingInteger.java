public class DescendingInteger {
    
    public static void main(String[] args) {
		descendingInteger(118372);
	}

	public static long descendingInteger(long n) {
		String str = Long.toString(n);

		char[] newArr = new char[str.length()];
		int cnt = str.length() - 1;
		
		for (int i = 0; i < str.length(); i++) {
			newArr[cnt] = str.charAt(i);
			cnt--;
		}
		return Long.parseLong(String.valueOf(newArr));
	}
}
