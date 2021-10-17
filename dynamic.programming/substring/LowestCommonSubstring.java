package substring;

public class LowestCommonSubstring {
	
	
	public static int lowestCommonSubstring(char[] x, char[] y, int m, int n, int count)
	{
		if (m == 0 || n == 0) {
			return count;
		}

		if (x[m - 1] == y[n - 1]) {
			count =  lowestCommonSubstring(x, y, m - 1, n - 1, count+1);
		}

		count = Math.max(count ,  Math.max(lowestCommonSubstring(x, y, m, n - 1, 0),lowestCommonSubstring(x, y, m - 1, n, 0)));
		return count;
	}
	
	public static void main(String[] args) {
		String s1 = "AcGvGTAB";
	    String s2 = "AcGGTAB";
	 
	    char[] X=s1.toCharArray();
	    char[] Y=s2.toCharArray();
	    int m = X.length;
	    int n = Y.length;
	    int count = 0;
	    
		System.out.println(lowestCommonSubstring(X, Y, m, n, count));
	}

}
