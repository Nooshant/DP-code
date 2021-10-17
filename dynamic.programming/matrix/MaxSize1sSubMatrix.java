package matrix;

public class MaxSize1sSubMatrix {

	private static void printMaxSubSquare(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		System.out.println("m:"+m+" n:"+n);
		int[][] a = new int[m][n];
		
		for(int i=0;i<n;i++)
		{
			a[0][i] = matrix[0][i];
		}
		for(int i=0;i<m;i++)
		{
			a[i][0] = matrix[i][0];
		}
		
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if(matrix[i][j]==0)
				{
					a[i][j]=0;
				}else {
					a[i][j]=Math.min(Math.min(a[i][j-1], a[i-1][j]),a[i-1][j-1])+1;
				}
			}
		}
		
		int max= Integer.MIN_VALUE;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(max<a[i][j])
				{
					max = a[i][j];
				}
			}
		}
		System.out.println("Maximum sub-matrix of 1s is:"+max);
	}
	
	public static void main(String[] args) {
		int matrix[][] = {{0, 1, 1, 0, 1},
                		  {1, 1, 0, 1, 0},
                		  {0, 1, 1, 1, 0},
                		  {1, 1, 1, 1, 0},
                		  {1, 1, 1, 1, 1},
                		  {0, 0, 0, 0, 0}};
         
			printMaxSubSquare(matrix);
	}


}
