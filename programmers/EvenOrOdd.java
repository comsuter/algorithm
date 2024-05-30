public class EvenOrOdd {
    public static void main(String[] args) {
		evenOrOdd(4);
	}
	
	public static String evenOrOdd(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }
}
