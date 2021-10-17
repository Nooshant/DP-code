package knapsack;

public class EqualSumPartitionKS {

	private static boolean equalSumPartition(int[] arr, int n) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		//if number is odd means equal partition is impossible
		if (sum % 2 != 0)
            return false;
		//Check for half sum value subset available or not. if yes means it has equal sum partition
		return isSubsetSum(arr, sum / 2, n);
	}

	private static boolean isSubsetSum(int[] arr, int sum, int n) {
		if (sum == 0) {
			return true;
		}
		if (n == 0) {
			return false;
		}
		
		// condition either include or not include 
		if (arr[n - 1] <= sum) {
			return isSubsetSum(arr, sum - arr[n - 1], n - 1) || isSubsetSum(arr, sum, n - 1);
		} else {
			//don't include since number is greater than provided sum
			return isSubsetSum(arr, sum, n - 1);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 3, 2, 3, 13 };
		int n = 6;
		System.out.println(equalSumPartition(arr, n));
	}
}
