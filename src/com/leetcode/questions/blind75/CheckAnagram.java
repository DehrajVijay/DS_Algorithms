package com.leetcode.questions.blind75;

import java.util.Arrays;
//https://leetcode.com/problems/valid-anagram/description/?envType=problem-list-v2&envId=oizxjoit

public class CheckAnagram {
/**
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 * @param s
 * @param t
 * @return
 */
	public static boolean isAnagramByBruteForce(String s, String t) {
        // If lengths differ, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to character arrays to allow sorting
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        // Sort both arrays alphabetically
        // Time: O(n log n)
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        // Compare the sorted arrays
        // If they are equal, it's an anagram
        return Arrays.equals(sChars, tChars);
    }
	
	/**
	 * Time Complexity: O(n)
	 * Space Complexity: O(1) Although we use an array, its size is fixed at 26 regardless of how large the input string is
	 * @param s
	 * @param t
	 * @return
	 */
	public static boolean isAnagramByHashArray(String s, String t) {
        // Step 1: Length check
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Initialize a frequency counter for 26 letters (a-z)
        int[] counter = new int[26];

        // Step 3: Iterate through both strings simultaneously
        for (int i = 0; i < s.length(); i++) {
            // Increment for string s
            counter[s.charAt(i) - 'a']++;
            // Decrement for string t
            counter[t.charAt(i) - 'a']--;
        }

        // Step 4: Check if all counts returned to zero
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hat";
		String t = "aht";

		System.out.println(isAnagramByBruteForce(s, t));
		System.out.println(isAnagramByHashArray(s, t));

	}

}
