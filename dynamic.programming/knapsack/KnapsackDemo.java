package knapsack;

public class KnapsackDemo {
	
	private static int knapsackMaxVal(int w, int[] wt, int[] val, int n) {
		if(n==0 || w==0)
		{
			return 0;
		}
		if(wt[n-1]<=w)
		{
			return Math.max(val[n-1] + knapsackMaxVal(w-wt[n-1], wt, val, n-1), knapsackMaxVal(w, wt, val, n-1));
		}
		else {
			return knapsackMaxVal(w, wt, val, n-1);
		}
	}

	public static void main(String[] args) {
		
		int val[] = { 60, 100, 120 };  
	    int wt[] = { 10, 20, 30 };  
	     
	    int W = 50; 
	    int N = val.length;        
	     
	    System.out.println(knapsackMaxVal(W, wt, val, N));  
	}
}
