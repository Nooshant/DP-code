package substring;

import java.util.Arrays;

public class LowestCommonSubsequenceMemoization {
	
	
	public static int  lcs(char[] x, char[] y, int m, int n, int[][] t)
	{
		if (m == 0 || n == 0) {
			return 0;
		}
		if (t[m - 1][n - 1] != -1) {
			return t[m - 1][n - 1];
		}

		if (x[m - 1] == y[n - 1]) {
			t[m - 1][n - 1] = lcs(x, y, m - 1, n - 1, t)+1;
		}
		else {
			t[m - 1][n - 1] = Math.max(lcs(x, y, m, n - 1, t), lcs(x, y, m - 1, n, t));
		}

		return t[m - 1][n - 1];
	}
	
	public static void main(String[] args) {
		String s1 = "AGGTAB";
		String s2 = "GXTXAYB";

		char[] X = s1.toCharArray();
		char[] Y = s2.toCharArray();
		int m = X.length;
		int n = Y.length;

		int[][] t = new int[m + 1][n + 1];

		for (int[] row : t) {
            Arrays.fill(row, -1);
        }
		System.out.println(lcs(X, Y, m, n, t));
	}

}
