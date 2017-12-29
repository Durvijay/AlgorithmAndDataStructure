package SubMatrixWithLargestSum;

public class SubMatrixWithLargestSum {

	public static void main(String[] args) {
		 int mat[][] = {{1, 1, 1, 1, 1},{2, 2, 2, 2, 2},{3, 8, 6, 7, 3},{4, 4, 4, 4, 4},{5, 5, 5, 5, 5}};
		 System.out.println(findMaxSum(mat));
	}

	static int findMaxSum (int matrix[][])
	{
		int numRows=matrix.length;
		int numCols=matrix[0].length;
	    int maxSum=0;
	 
	    for (int left = 0; left < numCols; left++)
	    {
	        int temp[] = new int[numRows];
	 
	        for (int right = left; right < numCols; right++)
	        {
	            // Find sum of every mini-row between left and right columns and save it into temp[]
	            for (int i = 0; i < numRows; ++i)
	                temp[i] += matrix[i][right];
	 
	            // Find the maximum sum subarray in temp[].
	            int sum = kadane(temp, numRows);
	 
	            if (sum > maxSum)
	                maxSum = sum;
	        }
	    }
	 
	    return maxSum;
	}

	private static int kadane(int[] temp, int numRows) {
		int sum=Integer.MIN_VALUE;
		int total=Integer.MIN_VALUE;
		for (int i = 0; i < numRows; i++) {
			sum=Math.max(sum+temp[i], temp[i]);
			total=Math.max(sum, total);
		}
		return total;
	}

}
