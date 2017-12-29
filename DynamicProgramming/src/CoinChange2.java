
public class CoinChange2 {

	public static void main(String[] args) {
		long n = 4;
		long[] coin = { 1, 2, 3 };
		long ways = getWays(n, coin);
		System.out.println(ways);
	}

	static long getWays(long n, long[] c) {

		return getWays(n, c) + getWays(n, c);
	}

}
