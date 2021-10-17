package knapsack;

public class CountSubsetSumKS {
	
	private static int subsetSum(int[] arr, int n, int sum) {
		if (sum == 0)
		{
			return 1;
		}
		if (n == 0)
		{
			return 0;
		}
		
		if(arr[n-1] <= sum)
		{
			return subsetSum(arr, n - 1, sum - arr[n - 1]) + subsetSum(arr, n-1, sum);
		}
		return subsetSum(arr, n-1, sum);
	}

	public static void main(String[] args) {
		int n = 4;
		int arr[] = { 3, 3, 3, 3 };
		int sum = 6;

		System.out.print(subsetSum(arr, n, sum));
	}
}
