package substring;

public class LongestPalindromeSequence {
	
	public static int longestPalindrome(String str, int i, int j)
	{
		if (i > j) {
			return 0;
		}

		if (i == j) {
			return 1;
		}

		if (str.charAt(i) == str.charAt(j)) {
			return longestPalindrome(str, i + 1, j - 1) + 2;
		}
		return Math.max(longestPalindrome(str, i + 1, j), longestPalindrome(str, i, j - 1));
	}
	
	public static void main(String[] args) {
		String str="forgeeksskeegfor";
		int len = longestPalindrome(str,0,str.length()-1);
		System.out.println(len);
	}
}
