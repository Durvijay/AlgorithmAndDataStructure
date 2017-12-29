
public class MinCost {

	public static void main(String[] args) {
		int cost[][] = { { 5, 2, 3 }, { 4, 8, 2 }, { 1, 5, 3 } };
		
		System.out.println(calcuateMinCostPath(cost, 2, 2));
		System.out.println(calcuateMinCostPath2(cost, 2, 2));
	}

	private static int calcuateMinCostPath2(int[][] cost, int i, int j) {
		int result[][] = new int[cost.length][cost[0].length];
		result[0][0]=cost[0][0];
		for (int k = 1; k < cost.length; k++) {
			result[0][k]=cost[0][k]+result[0][k-1];
		}
		for (int k = 1; k < cost[0].length; k++) {
			result[k][0]=cost[k][0]+result[k-1][0];
		}
		for (int k = 1; k < cost.length; k++) {
			for (int k2 = 1; k2 < cost[0].length; k2++) {
				result[k][k2]=cost[k][k2]+Math.min(Math.min(result[k-1][k2-1], result[k][k2-1]), result[k-1][k2]);
			}
		}
		return result[i][j];
	}

	private static int calcuateMinCostPath(int[][] cost, int i, int j) {
		if (i < 0 || j < 0) {
			return Integer.MAX_VALUE;
		} 
		if (i == 0 && j == 0)
			return cost[i][j];
		else
			return cost[i][j]
					+ Math.min(Math.min(calcuateMinCostPath(cost, i - 1, j - 1), calcuateMinCostPath(cost, i, j - 1)),
							calcuateMinCostPath(cost, i - 1, j));
	}

}
