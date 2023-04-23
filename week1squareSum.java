public class Main {
	public static int sumOfSquares(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n == 0) {
            return 0;
        }
		if (n == 1) {
			return 1;
		} else {
			return n * n + sumOfSquares(n - 1);
		}
	}

	public static void main(String[] args) {
		int n = 8;
		System.out.println(sumOfSquares(n));
	}
}

// This code is contributed by shivhack999
