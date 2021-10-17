package knapsack;

public class KnapsackMemoized {
	
	private static int knapsackMax(int w, int[] wt, int[] val, int n, int[][] t) {
		if(n==0 || w==0)
		{
			return 0;
		}
		
		if(t[n][w]!= -1)
		{
			return t[n][w];
		}
		if(wt[n-1]<=w)
		{
			t[n][w] = Math.max(val[n-1] + knapsackMax(w-wt[n-1], wt, val, n-1), knapsackMax(w, wt, val, n-1));
		}
		else {
			t[n][w] = knapsackMax(w, wt, val, n-1);
		}
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
		int[][] t = new int[n + 1][w + 1];

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= w; j++) {
				t[i][j] = -1;
			}
		}
		return knapsackMax(w, wt, val, n, t);
	}

}
