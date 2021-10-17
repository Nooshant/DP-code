package unboundedKnapsack;

public class RodCuttingMinCost {
	
	// price array, cuts len array, size of rod, length of price Array
	public static int minCost(int[] price, int[] cuts, int rodSize, int n)
	{
		if(rodSize==0 || n == 0)
		{
			return 0;
		}
		
		if(cuts[n-1] <= rodSize)
		{
			return Math.min(price[n-1] + minCost(price, cuts, rodSize-cuts[n-1], n), minCost(price, cuts, rodSize, n-1));
		}
		else {
			return minCost(price, cuts, rodSize, n-1);
		}
	}

	public static void main(String[] args) {
		int len = 9;
		int[] price = { 5, 6, 1, 4, 2 };
		int n = price.length;
		int rodLen[] = new int[n];
		for (int i = 1; i <= rodLen.length; i++) {
			rodLen[i-1]=i;
		}
		int minProfit = minCost(price, rodLen, len, n);
		System.out.println("Min profit from rod cutting: " + minProfit);
	}

}
