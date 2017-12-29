
public class MaxRectangle {

	public static void main(String[] args) {
		int [][] mat = {{0, 1, 1, 0},
		                {1, 1, 1, 1},
		                {1, 1, 1, 1},
		                {1, 1, 0, 0}};

	}
	public static void calculateRectangleArea(int [][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				
			}
		}
	}
	
	public static void calculateArea(int [][] mat,int i) {
		int len=0,count=0;int minNo=1,minVal=1;
		for (int j = 0; j < mat[0].length; j++) {
			minVal=Math.min(minVal, mat[i][j]);
			if(mat[i][j]>0)
				count++;
			else{
				//if()
				len=Math.max(len, count);
				count=0;
			}
		}
	}
	
}
