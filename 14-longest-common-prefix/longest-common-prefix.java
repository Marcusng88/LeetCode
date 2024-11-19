
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        StringBuilder res = new StringBuilder();
        String str = strs[0]; // Take the first string as the reference.

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            for (int j = 1; j < strs.length; j++) {
                // Check if the current character is out of bounds or mismatched.
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return res.toString(); // Return the result collected so far.
                }
            }

            // If all strings match the current character, add it to the result.
            res.append(currentChar);
        }

        return res.toString(); // Return the result after the loop.
    }
}

        
