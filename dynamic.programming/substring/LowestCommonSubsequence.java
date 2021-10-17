package substring;

public class LowestCommonSubsequence {
	
	
	public static int lowestCommonSubsequence(char[] x, char[] y, int m, int n)
	{
		if (m == 0 || n == 0) {
			return 0;
		}

		if (x[m - 1] == y[n - 1]) {
			return 1 + lowestCommonSubsequence(x, y, m - 1, n - 1);
		}

		return Math.max(lowestCommonSubsequence(x, y, m, n - 1), lowestCommonSubsequence(x, y, m - 1, n));
	}
	
	public static void main(String[] args) {
		String s1 = "AGGTAB";
	    String s2 = "GXTXAYB";
	 
	    char[] X=s1.toCharArray();
	    char[] Y=s2.toCharArray();
	    int m = X.length;
	    int n = Y.length;
	    
	    System.out.println(lowestCommonSubsequence(X,Y,m,n));
	}

}
