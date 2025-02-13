public class Solution {
    public String longestPalindrome(String s) {

	// Check if there is less than one character
	if (s.length() <= 1) {
            return s;
        }

        int maxLen = 1;

	int start = 0;
        int end = 0;

	boolean[][] dp = new boolean[s.length()][s.length()];

	
        for (int i = 0; i < s.length(); i++) {
	    // A single character is always a palindrome
	    dp[i][i] = true;
	    
	    for (int j = 0; j < i; j++) {

		// If the position of both j and i are the same
		// AND (if the are 1 or 2 characters of separation ("aa" with one, "aba" with two) OR if the substring between j+1 and i-1 is a palindrome)
		if (s.charAt(j) == s.charAt(i) && (i - j <= 2 || dp[j + 1][i - 1])) {
                    dp[j][i] = true;

		    // Update the max Length when necessary, and store j and i.
                    if (i - j + 1 > maxLen) {
                        maxLen = i - j + 1;
                        start = j;
                        end = i;
                    }
                }
            }
        }

        return s.substring(start, end + 1);
    }
}
