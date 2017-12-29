public class LongestPalindromesubsequence {

	

	// Returns the length of the longest palindromic subsequence in seq
	static int lps(String seq) {
		int n = seq.length();
		int i, j, sublength;
		int L[][] = new int[n][n]; // Create a table to store results of
									// subproblems

		for (i = 0; i < n; i++)
			L[i][i] = 1;

		for (sublength = 2; sublength <= n; sublength++) {
			for (i = 0; i < n - sublength + 1; i++) {
				j = i + sublength - 1;
				if (seq.charAt(i) == seq.charAt(j) && sublength == 2)
					L[i][j] = 2;
				else if (seq.charAt(i) == seq.charAt(j))
					L[i][j] = L[i + 1][j - 1] + 2;
				else
					L[i][j] = Math.max(L[i][j - 1], L[i + 1][j]);
			}
		}

		return L[0][n - 1];
	}

	/* Driver program to test above functions */
	public static void main(String args[]) {
		String seq = "AABCDEBAZ";
		int n = seq.length();
		System.out.println("The lnegth of the lps is " + lps(seq));
	}
}