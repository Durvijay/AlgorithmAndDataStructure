
public class adobe {

	public static void main(String[] args) {
		int K = 5;
		System.out.println(isBinaryDivisible(Long.toBinaryString(655515), K));
	}

	private static boolean isBinaryDivisible(String binaryString, int K) {
		System.out.println(binaryString);
		char c[] = new StringBuilder(binaryString).reverse().toString().toCharArray();
		int rem = 0;
		for (int i = 0; i < c.length; i++) {
			rem = ((((int) Math.pow(2, i) * Integer.parseInt("" + c[i])) % K) + rem) % K;
		}
		return rem == 0;
	}

}
