package unboundedKnapsack;

public class CoinChange {
	
	public static int  count(int[] arr, int j, int n) {
		if(j==0)
		{
			return 0;
		}
		
		if(n==0)
		{
			return 1;
		}
		
		if(arr[j-1] > n)
		{
			return count(arr, j-1, n);
		}
		else {
			return count(arr, j-1, n) + count(arr, j-1, n-arr[j-1]);
		}
	}

	public static void main(String[] args) {
		int arr[] ={2,5,3,6};
		int n = 10;
		System.out.println(count(arr, arr.length, n));
	}
}
