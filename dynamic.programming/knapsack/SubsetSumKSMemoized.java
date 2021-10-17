package knapsack;

public class SubsetSumKSMemoized {
	
	private static boolean isSubsetSum(int[] set, int n, int sum, boolean[][] t) {
		if (sum == 0 || n == 0) {
			return true;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sum ; j++) {
				if (set[i - 1] > j) {
					t[i][j] = t[i - 1][ j];
				}
				else {
					t[i][j] = t[i - 1][j - set[i - 1]] || t[i - 1][ j];
				}
			}
		}
		return t[n][sum];
	}
	
	public static void main(String[] args) {
		int set[] = { 3, 34, 4, 12, 5, 2 };
        int sum = 17;
        int n = set.length;
        
        
        boolean t[][]= new boolean[set.length+1][sum+1];
        for (int i = 0; i <= sum; i++) {
			t[0][i] = false;
		}
        for (int i = 0; i <= n; i++) {
        	t[i][0] = true;
        }        
        
        boolean isSum = isSubsetSum(set, n, sum, t);
        System.out.println("Is Subset sum available: "+isSum);
	}
}
