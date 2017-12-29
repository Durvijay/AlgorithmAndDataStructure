

public class GoldMineProblem {

	public static void main(String[] args) {
		int sum=0;
		int mat[][] = {{10, 33, 13, 15},
                {22, 21, 04, 1},
                {5, 0, 2, 3},
                {0, 6, 14, 2}};
		int r=mat.length;
		int c=mat[0].length;int max=0;
		for (int j = c-2; j >=0; j--) {
			for (int i = 0;i<r; i++) {
				int right = mat[i][j+1];
				int rightUp = i==0?0:mat[i-1][j+1];
				int rightDown = i==r-1?0:mat[i+1][j+1];
				mat[i][j]=mat[i][j]+Math.max(Math.max(rightUp, rightDown),right);
				max=Math.max(mat[i][j], max);
			}
		}
		System.out.println(max);
		
	}

	
}
