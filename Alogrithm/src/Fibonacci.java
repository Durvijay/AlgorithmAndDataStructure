
public class Fibonacci {

	public static void main(String[] args) {
		int n = 6;
		System.out.println(fib(n));

	}

	static int fib(int n) {
		if (n == 1 || n == 2)
			return 1;
		int f[] = new int[n + 1];
		int i;

		f[0] = 0;
		f[1] = 1;

		for (i = 2; i <= n; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}

		return f[n];
	}

}
