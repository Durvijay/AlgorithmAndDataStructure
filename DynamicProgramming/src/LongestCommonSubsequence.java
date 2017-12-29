
public class LongestCommonSubsequence {

	public static void main(String[] args) {
		String s1 = "AGGTB";
	    String s2 = "GXTAXYB";
	 
	    char[] X=s1.toCharArray();
	    char[] Y=s2.toCharArray();
	    int m = X.length;
	    int n = Y.length;
	 
	    System.out.println("Length of LCS is" + " " +lcs( X, Y, m, n ) );

	}

	static int lcs( char[] X, char[] Y, int m, int n )
	  {
	    if (m == 0 || n == 0)
	      return 0;
	    if (X[m-1] == Y[n-1])
	      return 1 + lcs(X, Y, m-1, n-1);
	    else
	      return Math.max(lcs(X, Y, m, n-1), lcs(X, Y, m-1, n));
	  }
}
