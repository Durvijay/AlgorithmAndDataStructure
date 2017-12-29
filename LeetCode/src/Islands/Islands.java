// Java program to count islands in boolean 2D matrix

package Islands;

public class Islands {
	// No of rows and columns
	static final int ROW = 5, COL = 5;

	void DFS(int M[][], int row, int col, boolean visited[][]) {

		
		if ((row >= 0) && (row < ROW) && (col >= 0) && (col < COL) && (M[row][col] == 1 && !visited[row][col])){
			visited[row][col] = true;
			DFS(M, row + 1, col + 1, visited);
			DFS(M, row , col + 1, visited);
			DFS(M, row + 1, col, visited);
			DFS(M, row + 1, col-1, visited);
		}
	}

	int countIslands(int M[][]) {
		boolean visited[][] = new boolean[ROW][COL];
		int count = 0;
		for (int i = 0; i < ROW; ++i)
			for (int j = 0; j < COL; ++j)
				if (M[i][j] == 1 && !visited[i][j]) // If a cell with
				{ // value 1 is not
					DFS(M, i, j, visited);
					++count;
				}

		return count;
	}

	// Driver method
	public static void main(String[] args) throws Exception {
		int M[][] = new int[][] { { 1, 1, 0, 0, 0 }, 
								  { 0, 1, 0, 0, 1 }, 
								  { 1, 0, 0, 1, 1 }, 
								  { 0, 0, 0, 0, 0 },
								  { 1, 0, 1, 0, 1 } };
		Islands I = new Islands();
		System.out.println("Number of islands is: " + I.countIslands(M));
	}
} // Contributed by Aakash Hasija