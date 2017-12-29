
public class CoinChange {

	public static void main(String[] args) {
		int n=4;
		int [] s = {1,2,3};
		System.out.println(countWays(s,s.length,n));
	//	System.out.println(calculateCoinChangeRequired(s,n,s.length));
	}
	
	 static long countWays(int S[], int m, int n)
	    {
	        //Time complexity of this function: O(mn)
	        //Space Complexity of this function: O(n)
	 
	       
	        long[] table = new long[n+1];
	        table[0] = 1;
	 
	        for (int i=0; i<m; i++)
	            for (int j=S[i]; j<=n; j++)
	                table[j] += table[j-S[i]];
	        return table[n];
	    }

	private static int calculateCoinChangeRequired(int[] s, int n, int length) {
		if (n == 0)
	        return 1;
	     
	    if (n < 0)
	        return 0;
	 
	    if (length <=0 && n >= 1)
	        return 0;
		return calculateCoinChangeRequired(s,n,length-1) + calculateCoinChangeRequired(s,n-s[length-1],length);
	}

}
