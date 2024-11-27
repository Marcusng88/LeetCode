
class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Edge case: if the input array is empty, return an empty string
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Start with the first string as the initial prefix
        String prefix = strs[0];
        
        // Iterate through the rest of the strings
        for (int i = 1; i < strs.length; i++) {
            // While the current string does not start with the prefix, shorten the prefix
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                // If the prefix becomes empty, return an empty string
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        // Return the final prefix
        return prefix;

    }
}

        
