import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int[] arr = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
		System.out.println(lengthOfLIS(arr));
		System.out.println(increasingSubseq(arr, arr.length));
		System.out.println(_lis(arr, arr.length));
	}

	static int total = 1;

	 public static int lengthOfLIS(int[] nums) {            
	        int[] dp = new int[nums.length];
	        int len = 0;

	        for(int x : nums) {
	            int i = Arrays.binarySearch(dp, 0, len, x);
	        //    System.out.println(i);
	            if(i < 0) i = -(i + 1);
	            dp[i] = x;
	            if(i == len) len++;
	        }

	        return len;
	    }
	private static int increasingSubseq(int[] arr, int n) {
		if (n == 1) {
			return 1;
		}
		int res, max_ending_here = 1;
		for (int j = 1; j < n; j++) {
			res = increasingSubseq(arr, j);
			if (arr[j - 1] < arr[n-1] && res + 1 > max_ending_here) {
				max_ending_here = res + 1;
			}
		}
		if (total < max_ending_here)
			total = max_ending_here;

		return max_ending_here;
	}

	static int max_ref = 1;

	static int _lis(int arr[], int n) {
		if (n == 1)
			return 1;

		int res, max_ending_here = 1;

		for (int i = 1; i < n; i++) {
			res = _lis(arr, i);
			if (arr[i - 1] < arr[n - 1] && res + 1 > max_ending_here)
				max_ending_here = res + 1;
		}
		if (max_ref < max_ending_here)
			max_ref = max_ending_here;

		return max_ending_here;
	}

}
