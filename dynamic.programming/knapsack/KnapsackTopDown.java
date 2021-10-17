package knapsack;

public class KnapsackTopDown {
	
	private static int knapsackMax(int w, int[] wt, int[] val, int n, int[][] t) {
		if (n == 0 || w == 0) {
			return 0;
		}

		//just replaced the n -> i and w -> j in Memoized code
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= w; j++) {
				if (wt[i - 1] <= j) {
					t[i][j] = Math.max(val[i - 1] + t[i - 1][j - wt[i - 1]], t[i - 1][j]);
				} else {
					t[i][j] = t[i - 1][j];
				}
			}
		}
		// and return the grid last value
		return t[n][w];
	}

	public static void main(String[] args) {
		int val[] = { 60, 100, 120 };
		int wt[] = { 10, 20, 30 };

		int W = 50;
		int N = val.length;

		System.out.println(knapsackMax(W, wt, val, N));
	}

	private static int knapsackMax(int w, int[] wt, int[] val, int n) {
		int[][] t = new int[n + 1][w + 1];//n rows and w columns

		// initialize the first row to 0
		for (int i = 0; i <= n; i++) {
			t[i][0] = 0;
		}
		
		//initialize the first column to 0
		for (int j = 0; j <= w; j++) {
			t[0][j] = 0;
		}
		
		return knapsackMax(w, wt, val, n, t);
	}

}
