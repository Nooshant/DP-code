package knapsack;

public class MinimumSubsetSumDiffKS {

	private static int minimumSubset(int[] arr, int n) {
		int sum = 0;
		int sumCalculated = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return minDiffSubset(arr, sum, n, sumCalculated);
	}

	private static int minDiffSubset(int[] arr, int sum, int n, int sumCalculated) {

		if (n == 0) {
			return Math.abs((sum - sumCalculated) - sumCalculated);
		}
		return Math.min(minDiffSubset(arr, sum, n - 1, sumCalculated + arr[n - 1]),
				minDiffSubset(arr, sum, n - 1, sumCalculated));
	}

	public static void main(String[] args) {
		int arr[] = {3, 1, 4, 2, 2, 1};
        int n = arr.length;
		System.out.println(minimumSubset(arr, n));
	}
}
