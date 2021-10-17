package unboundedKnapsack;

public class RodCuttingMaxCost {
	
	// price array, cuts len array, size of rod, length of price Array
	public static int maxCost(int[] price, int[] cuts, int rodSize, int n) {
		if (rodSize == 0 || n == 0) {
			return 0;
		}

		if (cuts[n - 1] <= rodSize) {
			return Math.max(price[n - 1] + maxCost(price, cuts, rodSize - cuts[n - 1], n),
					maxCost(price, cuts, rodSize, n - 1));
		} else {
			return maxCost(price, cuts, rodSize, n - 1);
		}
	}

	public static void main(String[] args) {
		int len = 9;
		int[] price = {5,6,1,4,2};
		int n = price.length;
		int rodLen[] = new int[n];
		for (int i = 1; i <= rodLen.length; i++) {
			rodLen[i-1]=i;
		}
		System.out.println(rodLen);
		int maxProfit = maxCost(price, rodLen, len, n);
		System.out.println("Max profit from rod cutting: "+maxProfit);
		
	    int price1[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
	    int rodSize = 8;
	    int size = price1.length;
	    int rodLen1[] = new int[rodSize];
		for (int i = 1; i <= rodLen1.length; i++) {
			rodLen1[i-1]=i;
		}
		maxProfit = maxCost(price1, rodLen1, rodSize, size);
		System.out.println("Max profit from rod cutting: "+maxProfit);
	}
}
