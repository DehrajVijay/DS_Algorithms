package com.leetcode.questions.blind75;

public class ValidPalindrome {
/**
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 * @param s
 * @return
 */
	public static boolean isPalindromeByBruteForce(String s) {
		StringBuilder filtered = new StringBuilder();

		// Step 1 & 2: Clean the string
		for (char c : s.toCharArray()) {
			if (Character.isLetterOrDigit(c)) {
				filtered.append(Character.toLowerCase(c));
			}
		}

		// Step 3: Reverse the cleaned string
		String original = filtered.toString();
		String reversed = filtered.reverse().toString();

		// Step 4: Compare
		return original.equals(reversed);
	}
	
	/**
	 * Time Complexity: O(N)
	 * Space Complexity: O(1)
	 * @param s
	 * @return
	 */
	public boolean isPalindromeByTwoPointers(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            // Move left pointer if it's not a letter or digit
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Move right pointer if it's not a letter or digit
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            
            // Compare the characters after lowercasing them
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            
            left++;
            right--;
        }
        
        return true;
    }
	
	

	public static void main(String[] args) {
		String s = "   A man, a plan, a canal: Panama   ";
		System.out.println(isPalindromeByBruteForce(s));
		
		String temp = "   A man, a plan, a canal: Panama   @";
		System.out.println(temp.trim());
	}

}
